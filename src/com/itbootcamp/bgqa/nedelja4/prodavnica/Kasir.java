package com.itbootcamp.bgqa.nedelja4.prodavnica;

public class Kasir {
    private String ime;
    private int jmbg;
    private double plata;
    private Prodavnica prodavnica;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public Prodavnica getProdavnica() {
        return prodavnica;
    }

    public void setProdavnica(Prodavnica prodavnica) {
        this.prodavnica = prodavnica;
    }
}
