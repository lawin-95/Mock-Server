package com.MockServer;


import  static org.junit.Assert.assertEquals;

import de.sprengnetter.webservices.t2c.ws.v12.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;



public class ClientJUnitTest {

    private User user;
    private  Adresse adresse;
    private  BewertungsDaten bewertungsDaten;
    private BewerteDFHV bewerteDFHV;
    private ObjektDFHV dfhv;

    public void testdaten(){

        user = new User();
        user.setUsername("pfleger");
        user.setPasswort("G;3i))9V");
        user.setBenutzerKennung("pfleger");

        adresse = new Adresse();
        adresse.setHausNummer((short) 2);
        adresse.setOrt("Bad Neuenahr-Ahrweiler");
        adresse.setPlz("Herrstrasse");
        adresse.setStrasse("Herrstrasse");

        bewertungsDaten = new BewertungsDaten();
        bewertungsDaten.setStrKaufpreisDouble("40000,00");
        bewertungsDaten.setStrDarlehenssummeDouble(123000);
        bewertungsDaten.setStrVorhabenWB2Enum("Kaufen");
        bewertungsDaten.setFreieKennzeichnung(946676104);
        bewertungsDaten.setStrModernisierungsklassenWB5Enum("KEINE_ANGABEN");
        bewertungsDaten.setStrModernisierungsErmittlungWB5Enum("EINZELAUFSTELLUNG");
        bewertungsDaten.setErbbauRecht(false);

        bewerteDFHV = new BewerteDFHV();
        bewerteDFHV.setUser(user);
        bewerteDFHV.setAdresse(adresse);
        bewerteDFHV.setBewertungsDaten(bewertungsDaten);

        dfhv = new ObjektDFHV();
        dfhv.setBauJahr(2000);
        dfhv.setStrObjektartWEnum("EINFAMILIEN_WOHNHAUS");
        dfhv.setStrGrundFlaecheDouble(500);
        dfhv.setStrWertArtWB2Enum("WOHNFLEACHE");
        dfhv.setStrWertArtDouble((short) 150);
        dfhv.setGeschossAnzahl((short) 2);
        dfhv.setGaragenAnzahl((short) 0);
        dfhv.setStrAusstattungsstandardErmittlungWB6Enum("MANUELL");
        dfhv.setStrAusstattungWEnum("MITTEL");
        dfhv.setAusstattungAussenWaendegedaemmt(false);
        dfhv.setAusstattungGaesteWC(false);
        dfhv.setAusstattungLeitungenAufPutz(false);
        dfhv.setAusstattungMehrAlseinBad(false);
        dfhv.setAusstattungOffenerKamin(false);
        dfhv.setAusstattungSauna(false);
        dfhv.setStrEFHZFHBauweiseWEnum("FREISTEHEND");
        dfhv.setStrEFHZFHDachausbauWB2Enum("VOLL");
        dfhv.setStrEFHZFHGebaeudeartWEnum("FERTIGHAUS_MASSIV");
        dfhv.setStrEFHZFHUnterkellerungWEnum("VOLL");
        dfhv.setStrKellerAusbauWEnum("KEIN");
        dfhv.setStrArtAussenanlagenWEnum("UEBLICH");
        dfhv.setStrNutzungsWB2Enum("EIGENGENUTZT");
        dfhv.setPhotovoltaik(false);
        dfhv.setPhotovoltaikBaujahr((short) 0);




    }





}
