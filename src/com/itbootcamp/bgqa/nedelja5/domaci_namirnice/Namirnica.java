package com.itbootcamp.bgqa.nedelja5.domaci_namirnice;

public class Namirnica implements Comparable<Namirnica> {
    private String naziv;
    private double cena;

    public Namirnica(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Namirnica{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}';
    }

    @Override
    public int compareTo(Namirnica o) {
        if (this.naziv.equals(o.naziv)) {
            return 0;
        } else return -1;
    }
}
