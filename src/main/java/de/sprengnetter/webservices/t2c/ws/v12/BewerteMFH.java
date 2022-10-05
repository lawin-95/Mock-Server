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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://ws.t2c.webservices.sprengnetter.de/v12}user"/>
 *         &lt;element name="adresse" type="{http://ws.t2c.webservices.sprengnetter.de/v12}adresse"/>
 *         &lt;element name="Objekt_MFH" type="{http://ws.t2c.webservices.sprengnetter.de/v12}Objekt_MFH"/>
 *         &lt;element name="bewertungsDaten" type="{http://ws.t2c.webservices.sprengnetter.de/v12}bewertungsDaten"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user",
    "adresse",
    "objektMFH",
    "bewertungsDaten"
})
@XmlRootElement(name = "BewerteMFH")
public class BewerteMFH {

    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected Adresse adresse;
    @XmlElement(name = "Objekt_MFH", required = true)
    protected ObjektMFH objektMFH;
    @XmlElement(required = true)
    protected BewertungsDaten bewertungsDaten;

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Ruft den Wert der adresse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Adresse }
     *     
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Legt den Wert der adresse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresse }
     *     
     */
    public void setAdresse(Adresse value) {
        this.adresse = value;
    }

    /**
     * Ruft den Wert der objektMFH-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ObjektMFH }
     *     
     */
    public ObjektMFH getObjektMFH() {
        return objektMFH;
    }

    /**
     * Legt den Wert der objektMFH-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektMFH }
     *     
     */
    public void setObjektMFH(ObjektMFH value) {
        this.objektMFH = value;
    }

    /**
     * Ruft den Wert der bewertungsDaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BewertungsDaten }
     *     
     */
    public BewertungsDaten getBewertungsDaten() {
        return bewertungsDaten;
    }

    /**
     * Legt den Wert der bewertungsDaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BewertungsDaten }
     *     
     */
    public void setBewertungsDaten(BewertungsDaten value) {
        this.bewertungsDaten = value;
    }

}
