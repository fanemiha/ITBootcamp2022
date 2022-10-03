package com.itbootcamp.bgqa.nedelja5.domaciZaposleni;

import java.util.ArrayList;

public class TestRestoran {
    public static void main(String[] args) {
        ArrayList<Zaposleni> listaZaposlenih = new ArrayList<>();
        listaZaposlenih.add(
                new Konobar("Sinisa","kuvar",1955,5000,10,3));
        listaZaposlenih.add(
                new Konobar("Marija","kuvar",1981,4000,7,2));
        listaZaposlenih.add(
                new Konobar("Filip","konobar",2001,4000,8,1));
        listaZaposlenih.add(
                new Konobar("Nevena","konobar",1990,6000,8,3));

        Restoran restoran = new Restoran(listaZaposlenih);
        ArrayList<Zaposleni> stampaKon = restoran.stampajKonobare(3);
        System.out.println(stampaKon);
        ArrayList<Zaposleni> povecanje = restoran.povecajPlatuTrecojSmeni(listaZaposlenih);
        System.out.println(povecanje);

    }
}
