package com.itbootcamp.bgqa.nedelja4.domacivoce;

public class Breskva extends Voce {
    public Breskva(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }


    public static void main(String[] args) {
        Voce voce2 = new Voce("breskva","sezona je", 100.00,"zelena");
        System.out.println(voce2.ispis());
        System.out.println(voce2.getCenaZaKilogram());
        System.out.println(voce2.smanjiCenuBreskve());
    }
}
