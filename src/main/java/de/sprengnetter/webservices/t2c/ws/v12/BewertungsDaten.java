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
    protected BewertungsDaten.ZuFinanzieren zuFinanzieren;
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

    /**
     * Ruft den Wert der zuFinanzieren-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BewertungsDaten.ZuFinanzieren }
     *     
     */
    public BewertungsDaten.ZuFinanzieren getZuFinanzieren() {
        return zuFinanzieren;
    }

    /**
     * Legt den Wert der zuFinanzieren-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BewertungsDaten.ZuFinanzieren }
     *     
     */
    public void setZuFinanzieren(BewertungsDaten.ZuFinanzieren value) {
        this.zuFinanzieren = value;
    }

    /**
     * Ruft den Wert der strModernisierungsklassenWB5Enum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "strModernisierungWB2EnumBaederWCs",
        "strModernisierungWB2EnumBodenWandTreppenhaus",
        "strModernisierungWB2EnumDach",
        "strModernisierungWB2EnumFenster",
        "strModernisierungWB2EnumHeizung",
        "strModernisierungWB2EnumRaumaufteilung",
        "strModernisierungWB2EnumStromWasserLeitung",
        "strModernisierungWB2EnumWaermedaemmung"
    })
    public static class ZuFinanzieren {

        @XmlElement(required = true)
        protected String strModernisierungWB2EnumBaederWCs;
        @XmlElement(required = true)
        protected String strModernisierungWB2EnumBodenWandTreppenhaus;
        @XmlElement(required = true)
        protected String strModernisierungWB2EnumDach;
        @XmlElement(required = true)
        protected String strModernisierungWB2EnumFenster;
        @XmlElement(required = true)
        protected String strModernisierungWB2EnumHeizung;
        @XmlElement(required = true)
        protected String strModernisierungWB2EnumRaumaufteilung;
        @XmlElement(required = true)
        protected String strModernisierungWB2EnumStromWasserLeitung;
        @XmlElement(required = true)
        protected String strModernisierungWB2EnumWaermedaemmung;

        /**
         * Ruft den Wert der strModernisierungWB2EnumBaederWCs-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumBaederWCs() {
            return strModernisierungWB2EnumBaederWCs;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumBaederWCs-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumBaederWCs(String value) {
            this.strModernisierungWB2EnumBaederWCs = value;
        }

        /**
         * Ruft den Wert der strModernisierungWB2EnumBodenWandTreppenhaus-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumBodenWandTreppenhaus() {
            return strModernisierungWB2EnumBodenWandTreppenhaus;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumBodenWandTreppenhaus-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumBodenWandTreppenhaus(String value) {
            this.strModernisierungWB2EnumBodenWandTreppenhaus = value;
        }

        /**
         * Ruft den Wert der strModernisierungWB2EnumDach-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumDach() {
            return strModernisierungWB2EnumDach;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumDach-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumDach(String value) {
            this.strModernisierungWB2EnumDach = value;
        }

        /**
         * Ruft den Wert der strModernisierungWB2EnumFenster-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumFenster() {
            return strModernisierungWB2EnumFenster;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumFenster-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumFenster(String value) {
            this.strModernisierungWB2EnumFenster = value;
        }

        /**
         * Ruft den Wert der strModernisierungWB2EnumHeizung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumHeizung() {
            return strModernisierungWB2EnumHeizung;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumHeizung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumHeizung(String value) {
            this.strModernisierungWB2EnumHeizung = value;
        }

        /**
         * Ruft den Wert der strModernisierungWB2EnumRaumaufteilung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumRaumaufteilung() {
            return strModernisierungWB2EnumRaumaufteilung;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumRaumaufteilung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumRaumaufteilung(String value) {
            this.strModernisierungWB2EnumRaumaufteilung = value;
        }

        /**
         * Ruft den Wert der strModernisierungWB2EnumStromWasserLeitung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumStromWasserLeitung() {
            return strModernisierungWB2EnumStromWasserLeitung;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumStromWasserLeitung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumStromWasserLeitung(String value) {
            this.strModernisierungWB2EnumStromWasserLeitung = value;
        }

        /**
         * Ruft den Wert der strModernisierungWB2EnumWaermedaemmung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrModernisierungWB2EnumWaermedaemmung() {
            return strModernisierungWB2EnumWaermedaemmung;
        }

        /**
         * Legt den Wert der strModernisierungWB2EnumWaermedaemmung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrModernisierungWB2EnumWaermedaemmung(String value) {
            this.strModernisierungWB2EnumWaermedaemmung = value;
        }

    }

}
