package com.itbootcamp.bgqa.nedelja4.domacivoce;

public class Jagode  extends Voce {
    public Jagode(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }

    public static void main(String[] args) {
        Voce voce1 = new Voce("jagode","sezona je", 200.00,"crvena");
        System.out.println(voce1.ispis());
        System.out.println(voce1.sumaVoca());
        System.out.println(voce1.povecajCenuJagoda());
    }
}