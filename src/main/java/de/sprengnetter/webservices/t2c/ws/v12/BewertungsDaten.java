//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.16 um 04:38:42 AM CEST 
//


package de.sprengnetter.webservices.t2c.ws.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für bewertungsDaten complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="bewertungsDaten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strDarlehenssummeDouble" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="strKaufpreisDouble" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strModernisierungskostenDouble" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="strVorhabenWB2Enum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="freieKennzeichnung" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="zuFinanzieren">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="strModernisierungWB2EnumBaederWCs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="strModernisierungWB2EnumBodenWandTreppenhaus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="strModernisierungWB2EnumDach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="strModernisierungWB2EnumFenster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="strModernisierungWB2EnumHeizung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="strModernisierungWB2EnumRaumaufteilung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="strModernisierungWB2EnumStromWasserLeitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="strModernisierungWB2EnumWaermedaemmung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="strModernisierungsklassenWB5Enum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strModernisierungsErmittlungWB5Enum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="erbbauRecht" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bewertungsDaten", propOrder = {
    "strDarlehenssummeDouble",
    "strKaufpreisDouble",
    "strModernisierungskostenDouble",
    "strVorhabenWB2Enum",
    "freieKennzeichnung",
    "zuFinanzieren",
    "strModernisierungsklassenWB5Enum",
    "strModernisierungsErmittlungWB5Enum",
    "erbbauRecht"
})
public class BewertungsDaten {

    @XmlSchemaType(name = "unsignedShort")
    protected int strDarlehenssummeDouble;
    @XmlElement(required = true)
    protected String strKaufpreisDouble;
    @XmlElement(required = true)
    protected Object strModernisierungskostenDouble;
    @XmlElement(required = true)
    protected String strVorhabenWB2Enum;
    @XmlSchemaType(name = "unsignedInt")
    protected long freieKennzeichnung;
    @XmlElement(required = true)
    protected String strModernisierungsklassenWB5Enum;
    @XmlElement(required = true)
    protected String strModernisierungsErmittlungWB5Enum;
    protected boolean erbbauRecht;

    /**
     * Ruft den Wert der strDarlehenssummeDouble-Eigenschaft ab.
     * 
     */
    public int getStrDarlehenssummeDouble() {
        return strDarlehenssummeDouble;
    }

    /**
     * Legt den Wert der strDarlehenssummeDouble-Eigenschaft fest.
     * 
     */
    public void setStrDarlehenssummeDouble(int value) {
        this.strDarlehenssummeDouble = value;
    }

    /**
     * Ruft den Wert der strKaufpreisDouble-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrKaufpreisDouble() {
        return strKaufpreisDouble;
    }

    /**
     * Legt den Wert der strKaufpreisDouble-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrKaufpreisDouble(String value) {
        this.strKaufpreisDouble = value;
    }

    /**
     * Ruft den Wert der strModernisierungskostenDouble-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStrModernisierungskostenDouble() {
        return strModernisierungskostenDouble;
    }

    /**
     * Legt den Wert der strModernisierungskostenDouble-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStrModernisierungskostenDouble(Object value) {
        this.strModernisierungskostenDouble = value;
    }

    /**
     * Ruft den Wert der strVorhabenWB2Enum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrVorhabenWB2Enum() {
        return strVorhabenWB2Enum;
    }

    /**
     * Legt den Wert der strVorhabenWB2Enum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrVorhabenWB2Enum(String value) {
        this.strVorhabenWB2Enum = value;
    }

    /**
     * Ruft den Wert der freieKennzeichnung-Eigenschaft ab.
     * 
     */
    public long getFreieKennzeichnung() {
        return freieKennzeichnung;
    }

    /**
     * Legt den Wert der freieKennzeichnung-Eigenschaft fest.
     * 
     */
    public void setFreieKennzeichnung(long value) {
        this.freieKennzeichnung = value;
    }


    public String getStrModernisierungsklassenWB5Enum() {
        return strModernisierungsklassenWB5Enum;
    }

    /**
     * Legt den Wert der strModernisierungsklassenWB5Enum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrModernisierungsklassenWB5Enum(String value) {
        this.strModernisierungsklassenWB5Enum = value;
    }

    /**
     * Ruft den Wert der strModernisierungsErmittlungWB5Enum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrModernisierungsErmittlungWB5Enum() {
        return strModernisierungsErmittlungWB5Enum;
    }

    /**
     * Legt den Wert der strModernisierungsErmittlungWB5Enum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrModernisierungsErmittlungWB5Enum(String value) {
        this.strModernisierungsErmittlungWB5Enum = value;
    }

    /**
     * Ruft den Wert der erbbauRecht-Eigenschaft ab.
     * 
     */
    public boolean isErbbauRecht() {
        return erbbauRecht;
    }

    /**
     * Legt den Wert der erbbauRecht-Eigenschaft fest.
     * 
     */
    public void setErbbauRecht(boolean value) {
        this.erbbauRecht = value;
    }


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
     *         &lt;element name="strModernisierungWB2EnumBaederWCs" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="strModernisierungWB2EnumBodenWandTreppenhaus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="strModernisierungWB2EnumDach" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="strModernisierungWB2EnumFenster" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="strModernisierungWB2EnumHeizung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="strModernisierungWB2EnumRaumaufteilung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="strModernisierungWB2EnumStromWasserLeitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="strModernisierungWB2EnumWaermedaemmung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */

}
