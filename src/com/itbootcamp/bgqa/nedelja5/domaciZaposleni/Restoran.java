package com.itbootcamp.bgqa.nedelja5.domaciZaposleni;

import java.util.ArrayList;

public class Restoran {
    private ArrayList<Zaposleni> spisak;

    public Restoran(ArrayList<Zaposleni> spisak) {
        this.spisak = spisak;
    }
    //Stampanje svih konobara koji radi neku odredjenu smenu (prvu, drugu ili trecu)
    //public ArrayList<Zaposleni> stampajKonobare(int nekaSmena)

    public ArrayList<Zaposleni> stampajKonobare(int nekaSmena) {
        ArrayList<Zaposleni> listastampajKonobare = new ArrayList<>();
        for (Zaposleni i : this.spisak) {
            if (i.getSmena() == nekaSmena && i.getPozicija().equalsIgnoreCase("Konobar")) {
                listastampajKonobare.add(i);
            }
        }
        return listastampajKonobare;

    }

    //Povecanje dnevnice za 30% svima koji rade trecu smenu
    //public void povecajCenuTrecojSmeni(ArrayList<Zaposleni> zaposleni)

    public ArrayList<Zaposleni> povecajPlatuTrecojSmeni(ArrayList<Zaposleni> zaposleni) {
        for (Zaposleni trecaSmena : this.spisak) {
            if (trecaSmena.getSmena() == 3) {
                int povecanjePlate = trecaSmena.getDnevnica();
                povecanjePlate += povecanjePlate * 0.3;
                trecaSmena.setDnevnica(povecanjePlate);
            }
        }
        return zaposleni;
    }
}