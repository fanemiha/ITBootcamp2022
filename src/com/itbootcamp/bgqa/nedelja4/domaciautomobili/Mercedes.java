package com.itbootcamp.bgqa.nedelja4.domaciautomobili;

public class Mercedes extends Automobili {

    public Mercedes(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);

    }
    @Override
    public double oldTajmer() {
        double umanjenaCena = 0;
        if (getGodiste() < 2022 - 20 ) {
            umanjenaCena = getCena() * 0.8;
            return umanjenaCena;
        }
        return getCena();
    }

    public static void main(String[] args) {
        Automobili auto1 = new Automobili("mercedes", "bela", 2010, 0, 10_000);
        auto1.setGodiste(1999);
        System.out.println(auto1.oldTajmer());
    }

}