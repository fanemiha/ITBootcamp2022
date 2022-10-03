package com.itbootcamp.bgqa.nedelja4.domacivoce;

public class Voce {
    private String ime;
    private String sezona;
    private double cenaZaKilogram;
    private String boja;

    public Voce(String ime, String sezona, double cenaZaKilogram, String boja) {
        this.ime = ime;
        this.sezona = sezona;
        this.cenaZaKilogram = cenaZaKilogram;
        this.boja = boja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getSezona() {
        return sezona;
    }

    public void setSezona(String sezona) {
        this.sezona = sezona;
    }

    public double getCenaZaKilogram() {
        return cenaZaKilogram;
    }

    public void setCenaZaKilogram(double cenaZaKilogram) {
        this.cenaZaKilogram = cenaZaKilogram;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean jeSezona(String sezona) {
        if (sezona.equals("sezona je")) {
        }
        return true;
    }
    public double sumaVoca(){
        double pare = 200;
        //double kolicinaVoca = 0;
        double kolicinaVoca =pare / cenaZaKilogram;
        return kolicinaVoca;
    }
    public String ispis() {
        return String.format("Ime: %s, Sezona: %s, cenaZaKilogram: %f, Boja: %s", ime, sezona, cenaZaKilogram, boja);
    }
    public double smanjiCenuBreskve(){
        double smanjenjeCene = 0;
        if (getBoja() == "zelena") {
            smanjenjeCene = getCenaZaKilogram() * 0.85;
            return smanjenjeCene;
        }else return getCenaZaKilogram();
    }
    public double povecajCenuJagoda() {
        double uvecanjeCene = 0;
        if (sezona == "sezona je") {
            uvecanjeCene = getCenaZaKilogram() * 1.2;
            return uvecanjeCene;
        }
        return getCenaZaKilogram();
    }
}