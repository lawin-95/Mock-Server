package com.MockServer;

import de.sprengnetter.webservices.t2c.ws.v12.ObjektDFHV;
import de.sprengnetter.webservices.t2c.ws.v12.ObjektEFHZFH;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.HashMap;

@Component
public class SprengnetterRepository {

    private ObjektDFHV dfhv;
    private ObjektEFHZFH efhzfh;
    private String currentCustomer;
    @Value("${Customer1Path}")
    private String customer1Path;
    @Value("${Customer2Path}")
    private String customer2Path;
    @Value("${Customer3Path}")
    private String customer3Path;
    @Value("${Customer4Path}")
    private String customer4Path;

    public <T> T  readMockFromXML   (String path, T destinationClass)  {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(destinationClass.getClass());
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            T object = (T) jaxbUnmarshaller.unmarshal(file);
            return object;
        }catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
    public ObjektDFHV bewerteDFHV(String customer)  {
        if(!customer.equals(currentCustomer))
        {
            dfhv=null;
            efhzfh=null;
        }
        if (customer.equals("Customer1")){
            if (dfhv==null){
                dfhv =readMockFromXML(customer1Path,new ObjektDFHV());
            }
        }
        else if(customer.equals("Customer2")) {
            if (dfhv==null){
                dfhv =readMockFromXML(customer2Path,new ObjektDFHV());
            }

        }
        return dfhv;
    }

    public ObjektEFHZFH bewerteEFHZFH(String customer) {
        if (customer.equals("First")) {
            efhzfh.setBauJahr(2000);
            efhzfh.setStrObjektartWEnum("EINFAMILIEN_WOHNHAUS");
            efhzfh.setStrGrundFlaecheDouble(500);
            efhzfh.setStrWertArtWB2Enum("WOHNFLEACHE");
            efhzfh.setStrWertArtDouble((short) 150);
            efhzfh.setGeschossAnzahl((short) 2);
            efhzfh.setGaragenAnzahl((short) 0);
            efhzfh.setStrAusstattungsstandardErmittlungWB6Enum("MANUELL");
            efhzfh.setStrAusstattungWEnum("MITTEL");
            efhzfh.setAusstattungAussenWaendegedaemmt(false);
            efhzfh.setAusstattungGaesteWC(false);
            efhzfh.setAusstattungLeitungenAufPutz(false);
            efhzfh.setAusstattungMehrAlseinBad(false);
            efhzfh.setAusstattungOffenerKamin(false);
            efhzfh.setAusstattungSauna(false);
            efhzfh.setStrEFHZFHBauweiseWEnum("FREISTEHEND");
            efhzfh.setStrEFHZFHDachausbauWB2Enum("VOLL");
            efhzfh.setStrEFHZFHGebaeudeartWEnum("FERTIGHAUS_MASSIV");
            efhzfh.setStrEFHZFHUnterkellerungWEnum("VOLL");
            efhzfh.setStrKellerAusbauWEnum("KEIN");
            efhzfh.setStrArtAussenanlagenWEnum("UEBLICH");
            efhzfh.setStrNutzungsWB2Enum("EIGENGENUTZT");
            efhzfh.setPhotovoltaik(false);
            efhzfh.setPhotovoltaikBaujahr((short) 0);
            return efhzfh;
        }
        else {
            efhzfh.setBauJahr(2000);
            efhzfh.setStrObjektartWEnum("EINFAMILIEN_WOHNHAUS");
            efhzfh.setStrGrundFlaecheDouble(500);
            efhzfh.setStrWertArtWB2Enum("WOHNFLEACHE");
            efhzfh.setStrWertArtDouble((short) 150);
            efhzfh.setGeschossAnzahl((short) 2);
            efhzfh.setGaragenAnzahl((short) 0);
            efhzfh.setStrAusstattungsstandardErmittlungWB6Enum("Swiss");
            efhzfh.setStrAusstattungWEnum("MITTEL");
            efhzfh.setAusstattungAussenWaendegedaemmt(false);
            efhzfh.setAusstattungGaesteWC(false);
            efhzfh.setAusstattungLeitungenAufPutz(false);
            efhzfh.setAusstattungMehrAlseinBad(false);
            efhzfh.setAusstattungOffenerKamin(false);
            efhzfh.setAusstattungSauna(false);
            efhzfh.setStrEFHZFHBauweiseWEnum("FREISTEHEND");
            efhzfh.setStrEFHZFHDachausbauWB2Enum("VOLL");
            efhzfh.setStrEFHZFHGebaeudeartWEnum("FERTIGHAUS_MASSIV");
            efhzfh.setStrEFHZFHUnterkellerungWEnum("VOLL");
            efhzfh.setStrKellerAusbauWEnum("KEIN");
            efhzfh.setStrArtAussenanlagenWEnum("UEBLICH");
            efhzfh.setStrNutzungsWB2Enum("EIGENGENUTZT");
            efhzfh.setPhotovoltaik(false);
            efhzfh.setPhotovoltaikBaujahr((short) 0);
        }
        return efhzfh;
    }
}
