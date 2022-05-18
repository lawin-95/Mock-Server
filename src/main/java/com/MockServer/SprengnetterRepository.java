package com.MockServer;




import de.sprengnetter.webservices.t2c.ws.v12.ObjektDFHV;
import de.sprengnetter.webservices.t2c.ws.v12.ObjektEFHZFH;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;


@Component
public class SprengnetterRepository {

    private ObjektDFHV dfhv;
    private ObjektEFHZFH efhzfh;

    @PostConstruct
    public void initData() {

        dfhv = new ObjektDFHV();


        efhzfh = new ObjektEFHZFH();
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

    }

    public ObjektDFHV bewerteDFHV(String customer) {
        if (customer.equals("First")){
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
        else {
            dfhv.setBauJahr(2000);
            dfhv.setStrObjektartWEnum("EINFAMILIEN_WOHNHAUS");
            dfhv.setStrGrundFlaecheDouble(500);
            dfhv.setStrWertArtWB2Enum("WOHNFLEACHE");
            dfhv.setStrWertArtDouble((short) 150);
            dfhv.setGeschossAnzahl((short) 2);
            dfhv.setGaragenAnzahl((short) 0);
            dfhv.setStrAusstattungsstandardErmittlungWB6Enum("Swiss");
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
        return dfhv;
    }

    public ObjektEFHZFH bewerteEFHZFH() {
        return efhzfh;
    }
}
