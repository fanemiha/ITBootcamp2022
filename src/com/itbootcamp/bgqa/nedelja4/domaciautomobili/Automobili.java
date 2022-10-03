package com.itbootcamp.bgqa.nedelja4.domaciautomobili;

public class Automobili {
    private String marka;
    private String boja;
    private int brSasije;
    private int godiste;
    private int cena;

    public Automobili(String marka, String boja, int brSasije, int godiste, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.brSasije = brSasije;
        this.godiste = godiste;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int getBrSasije() {
        return brSasije;
    }

    public void setBrSasije(int brSasije) {
        this.brSasije = brSasije;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public double  oldTajmer(){
        return 0;
    }
}