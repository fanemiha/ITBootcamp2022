package com.itbootcamp.bgqa.nedelja5.domaciZaposleni;

public class Zaposleni {
    private String ime;
    private String pozicija;
    private int godiste;
    private int dnevnica;
    private int sati;
    private int smena;

    public Zaposleni(String ime, String pozicija, int godiste, int dnevnica, int sati, int smena) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.godiste = godiste;
        this.dnevnica = dnevnica;
        this.sati = sati;
        this.smena = smena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public int getDnevnica() {
        return dnevnica;
    }

    public void setDnevnica(int dnevnica) {
        this.dnevnica = dnevnica;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getSmena() {
        return smena;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }

    @Override
    public String toString() {
        return "Zaposleni{" +
                "ime='" + ime + '\'' +
                ", pozicija='" + pozicija + '\'' +
                ", godiste=" + godiste +
                ", dnevnica=" + dnevnica +
                ", sati=" + sati +
                ", smena=" + smena +
                '}';
    }
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Zaposleni)) {
            return false;
        }

        Zaposleni zaposleni = (Zaposleni) object;

        return this.getIme().equals(zaposleni.getIme()) &&
                this.getPozicija().equals(zaposleni.getPozicija()) &&
                this.getGodiste() == (zaposleni.getGodiste()) &&
                this.getDnevnica() == (zaposleni.getDnevnica()) &&
                this.getSati() == (zaposleni.getSati()) &&
                this.getSmena() == (zaposleni.getSmena());
    }

    public static void main(String[] args) {
        Zaposleni zaposleni = new Zaposleni("Stefan","konobar",1991,5000,8,1);
        Zaposleni zaposleni1 = new Zaposleni("Marko","kuvar",1991,8000,12,2);
        Zaposleni zaposleni3 = new Zaposleni("Vlada","konobar",1991,6000,10,3);

    }
}
