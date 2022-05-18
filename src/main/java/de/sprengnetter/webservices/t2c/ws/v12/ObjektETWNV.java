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
 * <p>Java-Klasse für Objekt_ETW_NV complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Objekt_ETW_NV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bauJahr" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="strObjektartWEnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strGrundFlaecheDouble" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="strWertArtWB2Enum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strWertArtDouble" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="geschossAnzahl" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="garagenAnzahl" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="strAusstattungsstandardErmittlungWB6Enum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strAusstattungWEnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ausstattungAussenWaendegedaemmt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ausstattungGaesteWC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ausstattungLeitungenAufPutz" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ausstattungMehrAlseinBad" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ausstattungOffenerKamin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ausstattungSauna" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="strEFHZFHBauweiseWEnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strEFHZFHDachausbauWB2Enum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strEFHZFHGebaeudeartWEnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strEFHZFHUnterkellerungWEnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strKellerAusbauWEnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strArtAussenanlagenWEnum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strNutzungsWB2Enum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="photovoltaik" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="photovoltaikBaujahr" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Objekt_ETW_NV", propOrder = {
    "bauJahr",
    "strObjektartWEnum",
    "strGrundFlaecheDouble",
    "strWertArtWB2Enum",
    "strWertArtDouble",
    "geschossAnzahl",
    "garagenAnzahl",
    "strAusstattungsstandardErmittlungWB6Enum",
    "strAusstattungWEnum",
    "ausstattungAussenWaendegedaemmt",
    "ausstattungGaesteWC",
    "ausstattungLeitungenAufPutz",
    "ausstattungMehrAlseinBad",
    "ausstattungOffenerKamin",
    "ausstattungSauna",
    "strEFHZFHBauweiseWEnum",
    "strEFHZFHDachausbauWB2Enum",
    "strEFHZFHGebaeudeartWEnum",
    "strEFHZFHUnterkellerungWEnum",
    "strKellerAusbauWEnum",
    "strArtAussenanlagenWEnum",
    "strNutzungsWB2Enum",
    "photovoltaik",
    "photovoltaikBaujahr"
})
public class ObjektETWNV {

    @XmlSchemaType(name = "unsignedShort")
    protected int bauJahr;
    @XmlElement(required = true)
    protected String strObjektartWEnum;
    @XmlSchemaType(name = "unsignedShort")
    protected int strGrundFlaecheDouble;
    @XmlElement(required = true)
    protected String strWertArtWB2Enum;
    @XmlSchemaType(name = "unsignedByte")
    protected short strWertArtDouble;
    @XmlSchemaType(name = "unsignedByte")
    protected short geschossAnzahl;
    @XmlSchemaType(name = "unsignedByte")
    protected short garagenAnzahl;
    @XmlElement(required = true)
    protected String strAusstattungsstandardErmittlungWB6Enum;
    @XmlElement(required = true)
    protected String strAusstattungWEnum;
    protected boolean ausstattungAussenWaendegedaemmt;
    protected boolean ausstattungGaesteWC;
    protected boolean ausstattungLeitungenAufPutz;
    protected boolean ausstattungMehrAlseinBad;
    protected boolean ausstattungOffenerKamin;
    protected boolean ausstattungSauna;
    @XmlElement(required = true)
    protected String strEFHZFHBauweiseWEnum;
    @XmlElement(required = true)
    protected String strEFHZFHDachausbauWB2Enum;
    @XmlElement(required = true)
    protected String strEFHZFHGebaeudeartWEnum;
    @XmlElement(required = true)
    protected String strEFHZFHUnterkellerungWEnum;
    @XmlElement(required = true)
    protected String strKellerAusbauWEnum;
    @XmlElement(required = true)
    protected String strArtAussenanlagenWEnum;
    @XmlElement(required = true)
    protected String strNutzungsWB2Enum;
    protected boolean photovoltaik;
    @XmlSchemaType(name = "unsignedByte")
    protected short photovoltaikBaujahr;

    /**
     * Ruft den Wert der bauJahr-Eigenschaft ab.
     * 
     */
    public int getBauJahr() {
        return bauJahr;
    }

    /**
     * Legt den Wert der bauJahr-Eigenschaft fest.
     * 
     */
    public void setBauJahr(int value) {
        this.bauJahr = value;
    }

    /**
     * Ruft den Wert der strObjektartWEnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrObjektartWEnum() {
        return strObjektartWEnum;
    }

    /**
     * Legt den Wert der strObjektartWEnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrObjektartWEnum(String value) {
        this.strObjektartWEnum = value;
    }

    /**
     * Ruft den Wert der strGrundFlaecheDouble-Eigenschaft ab.
     * 
     */
    public int getStrGrundFlaecheDouble() {
        return strGrundFlaecheDouble;
    }

    /**
     * Legt den Wert der strGrundFlaecheDouble-Eigenschaft fest.
     * 
     */
    public void setStrGrundFlaecheDouble(int value) {
        this.strGrundFlaecheDouble = value;
    }

    /**
     * Ruft den Wert der strWertArtWB2Enum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrWertArtWB2Enum() {
        return strWertArtWB2Enum;
    }

    /**
     * Legt den Wert der strWertArtWB2Enum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrWertArtWB2Enum(String value) {
        this.strWertArtWB2Enum = value;
    }

    /**
     * Ruft den Wert der strWertArtDouble-Eigenschaft ab.
     * 
     */
    public short getStrWertArtDouble() {
        return strWertArtDouble;
    }

    /**
     * Legt den Wert der strWertArtDouble-Eigenschaft fest.
     * 
     */
    public void setStrWertArtDouble(short value) {
        this.strWertArtDouble = value;
    }

    /**
     * Ruft den Wert der geschossAnzahl-Eigenschaft ab.
     * 
     */
    public short getGeschossAnzahl() {
        return geschossAnzahl;
    }

    /**
     * Legt den Wert der geschossAnzahl-Eigenschaft fest.
     * 
     */
    public void setGeschossAnzahl(short value) {
        this.geschossAnzahl = value;
    }

    /**
     * Ruft den Wert der garagenAnzahl-Eigenschaft ab.
     * 
     */
    public short getGaragenAnzahl() {
        return garagenAnzahl;
    }

    /**
     * Legt den Wert der garagenAnzahl-Eigenschaft fest.
     * 
     */
    public void setGaragenAnzahl(short value) {
        this.garagenAnzahl = value;
    }

    /**
     * Ruft den Wert der strAusstattungsstandardErmittlungWB6Enum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrAusstattungsstandardErmittlungWB6Enum() {
        return strAusstattungsstandardErmittlungWB6Enum;
    }

    /**
     * Legt den Wert der strAusstattungsstandardErmittlungWB6Enum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrAusstattungsstandardErmittlungWB6Enum(String value) {
        this.strAusstattungsstandardErmittlungWB6Enum = value;
    }

    /**
     * Ruft den Wert der strAusstattungWEnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrAusstattungWEnum() {
        return strAusstattungWEnum;
    }

    /**
     * Legt den Wert der strAusstattungWEnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrAusstattungWEnum(String value) {
        this.strAusstattungWEnum = value;
    }

    /**
     * Ruft den Wert der ausstattungAussenWaendegedaemmt-Eigenschaft ab.
     * 
     */
    public boolean isAusstattungAussenWaendegedaemmt() {
        return ausstattungAussenWaendegedaemmt;
    }

    /**
     * Legt den Wert der ausstattungAussenWaendegedaemmt-Eigenschaft fest.
     * 
     */
    public void setAusstattungAussenWaendegedaemmt(boolean value) {
        this.ausstattungAussenWaendegedaemmt = value;
    }

    /**
     * Ruft den Wert der ausstattungGaesteWC-Eigenschaft ab.
     * 
     */
    public boolean isAusstattungGaesteWC() {
        return ausstattungGaesteWC;
    }

    /**
     * Legt den Wert der ausstattungGaesteWC-Eigenschaft fest.
     * 
     */
    public void setAusstattungGaesteWC(boolean value) {
        this.ausstattungGaesteWC = value;
    }

    /**
     * Ruft den Wert der ausstattungLeitungenAufPutz-Eigenschaft ab.
     * 
     */
    public boolean isAusstattungLeitungenAufPutz() {
        return ausstattungLeitungenAufPutz;
    }

    /**
     * Legt den Wert der ausstattungLeitungenAufPutz-Eigenschaft fest.
     * 
     */
    public void setAusstattungLeitungenAufPutz(boolean value) {
        this.ausstattungLeitungenAufPutz = value;
    }

    /**
     * Ruft den Wert der ausstattungMehrAlseinBad-Eigenschaft ab.
     * 
     */
    public boolean isAusstattungMehrAlseinBad() {
        return ausstattungMehrAlseinBad;
    }

    /**
     * Legt den Wert der ausstattungMehrAlseinBad-Eigenschaft fest.
     * 
     */
    public void setAusstattungMehrAlseinBad(boolean value) {
        this.ausstattungMehrAlseinBad = value;
    }

    /**
     * Ruft den Wert der ausstattungOffenerKamin-Eigenschaft ab.
     * 
     */
    public boolean isAusstattungOffenerKamin() {
        return ausstattungOffenerKamin;
    }

    /**
     * Legt den Wert der ausstattungOffenerKamin-Eigenschaft fest.
     * 
     */
    public void setAusstattungOffenerKamin(boolean value) {
        this.ausstattungOffenerKamin = value;
    }

    /**
     * Ruft den Wert der ausstattungSauna-Eigenschaft ab.
     * 
     */
    public boolean isAusstattungSauna() {
        return ausstattungSauna;
    }

    /**
     * Legt den Wert der ausstattungSauna-Eigenschaft fest.
     * 
     */
    public void setAusstattungSauna(boolean value) {
        this.ausstattungSauna = value;
    }

    /**
     * Ruft den Wert der strEFHZFHBauweiseWEnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrEFHZFHBauweiseWEnum() {
        return strEFHZFHBauweiseWEnum;
    }

    /**
     * Legt den Wert der strEFHZFHBauweiseWEnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrEFHZFHBauweiseWEnum(String value) {
        this.strEFHZFHBauweiseWEnum = value;
    }

    /**
     * Ruft den Wert der strEFHZFHDachausbauWB2Enum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrEFHZFHDachausbauWB2Enum() {
        return strEFHZFHDachausbauWB2Enum;
    }

    /**
     * Legt den Wert der strEFHZFHDachausbauWB2Enum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrEFHZFHDachausbauWB2Enum(String value) {
        this.strEFHZFHDachausbauWB2Enum = value;
    }

    /**
     * Ruft den Wert der strEFHZFHGebaeudeartWEnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrEFHZFHGebaeudeartWEnum() {
        return strEFHZFHGebaeudeartWEnum;
    }

    /**
     * Legt den Wert der strEFHZFHGebaeudeartWEnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrEFHZFHGebaeudeartWEnum(String value) {
        this.strEFHZFHGebaeudeartWEnum = value;
    }

    /**
     * Ruft den Wert der strEFHZFHUnterkellerungWEnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrEFHZFHUnterkellerungWEnum() {
        return strEFHZFHUnterkellerungWEnum;
    }

    /**
     * Legt den Wert der strEFHZFHUnterkellerungWEnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrEFHZFHUnterkellerungWEnum(String value) {
        this.strEFHZFHUnterkellerungWEnum = value;
    }

    /**
     * Ruft den Wert der strKellerAusbauWEnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrKellerAusbauWEnum() {
        return strKellerAusbauWEnum;
    }

    /**
     * Legt den Wert der strKellerAusbauWEnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrKellerAusbauWEnum(String value) {
        this.strKellerAusbauWEnum = value;
    }

    /**
     * Ruft den Wert der strArtAussenanlagenWEnum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrArtAussenanlagenWEnum() {
        return strArtAussenanlagenWEnum;
    }

    /**
     * Legt den Wert der strArtAussenanlagenWEnum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrArtAussenanlagenWEnum(String value) {
        this.strArtAussenanlagenWEnum = value;
    }

    /**
     * Ruft den Wert der strNutzungsWB2Enum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNutzungsWB2Enum() {
        return strNutzungsWB2Enum;
    }

    /**
     * Legt den Wert der strNutzungsWB2Enum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNutzungsWB2Enum(String value) {
        this.strNutzungsWB2Enum = value;
    }

    /**
     * Ruft den Wert der photovoltaik-Eigenschaft ab.
     * 
     */
    public boolean isPhotovoltaik() {
        return photovoltaik;
    }

    /**
     * Legt den Wert der photovoltaik-Eigenschaft fest.
     * 
     */
    public void setPhotovoltaik(boolean value) {
        this.photovoltaik = value;
    }

    /**
     * Ruft den Wert der photovoltaikBaujahr-Eigenschaft ab.
     * 
     */
    public short getPhotovoltaikBaujahr() {
        return photovoltaikBaujahr;
    }

    /**
     * Legt den Wert der photovoltaikBaujahr-Eigenschaft fest.
     * 
     */
    public void setPhotovoltaikBaujahr(short value) {
        this.photovoltaikBaujahr = value;
    }

}
