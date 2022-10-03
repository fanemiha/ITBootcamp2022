package com.itbootcamp.bgqa.nedelja4.domaciautomobili;

public class BMW extends Automobili{
    public BMW(String marka, String boja, int brSasije, int godiste, int cena) {
        super(marka, boja, brSasije, godiste, cena);
    }
    @Override
    public double oldTajmer() {
        double umanjenaCena = 0;
        if (getGodiste() < 2022 - 25 ) {
            umanjenaCena = getCena() * 0.7;
            return umanjenaCena;
        }
        return getCena();
    }

    public static void main(String[] args) {
        Automobili auto2 = new Automobili("BMW","zelena",1020,1995,20_000);
        System.out.println(auto2.oldTajmer());
    }
}
