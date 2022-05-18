package com.MockServer;

import de.sprengnetter.webservices.t2c.ws.v12.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import  static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/*
public class JUnitTest {




    private User getTestUser(){
       User user = new User();
        user.setUsername("pfleger");
        user.setPasswort("G;3i))9V");
        user.setBenutzerKennung("pfleger");
        return user;
    }

    private Adresse getTestAdresse(){
        Adresse adresse = new Adresse();
        adresse.setHausNummer((short) 2);
        adresse.setOrt("Bad Neuenahr-Ahrweiler");
        adresse.setPlz("Herrstrasse");
        adresse.setStrasse("Herrstrasse");
        return adresse;
    }
    private BewertungsDaten getTestBewertungsdaten(){
        BewertungsDaten bewertungsDaten = new BewertungsDaten();
        bewertungsDaten.setStrKaufpreisDouble("40000,00");
        bewertungsDaten.setStrDarlehenssummeDouble(123000);
        bewertungsDaten.setStrVorhabenWB2Enum("Kaufen");
        bewertungsDaten.setFreieKennzeichnung(946676104);
        bewertungsDaten.setStrModernisierungsklassenWB5Enum("KEINE_ANGABEN");
        bewertungsDaten.setStrModernisierungsErmittlungWB5Enum("EINZELAUFSTELLUNG");
        bewertungsDaten.setErbbauRecht(false);
        return bewertungsDaten;
    }

    private void checkTestUser(User user){
        User expectedUser = getTestUser();
        Assertions.assertEquals(expectedUser.getUsername(),user.getUsername());
    }
    private void checkTestAdresse(Adresse adresse){

    }

    @Test
    public void bewerteDFHV(){
        BewerteDFHV bewerteDFHV = new BewerteDFHV();
        bewerteDFHV.setUser(getTestUser());
        bewerteDFHV.setAdresse(getTestAdresse());
        bewerteDFHV.setBewertungsDaten(getTestBewertungsdaten());
        ObjektDFHV dfhv = new ObjektDFHV();
        dfhv.setStrObjektartWEnum("EINFAMILIEN_WOHNHAUS");
        dfhv.setBauJahr(2000);
        SprengnetterRepository mockRepository = mock(SprengnetterRepository.class);
        when(mockRepository.bewerteDFHV("First")).thenReturn(dfhv);
        SprengnetterEndpoint endpoint = new SprengnetterEndpoint(mockRepository);
        BewerteDFHV response = endpoint.bewerteDFHV(bewerteDFHV);
        checkTestUser(response.getUser());
        checkTestAdresse(response.getAdresse());
        Assertions.assertNotNull(response.getObjektDFHV());
        Assertions.assertEquals("EINFAMILIEN_WOHNHAUS",response.getObjektDFHV().getStrObjektartWEnum());
        Assertions.assertEquals(2000,response.getObjektDFHV().getBauJahr());





    }
}
*/