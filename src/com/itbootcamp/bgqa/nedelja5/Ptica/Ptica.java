package com.itbootcamp.bgqa.nedelja5.Ptica;

import com.itbootcamp.bgqa.nedelja5.domaciZaposleni.Zaposleni;

import java.util.ArrayList;

public class Ptica {
    private double minRasponKrila, maxRasponKrila;

    private double rasponKrila;
    private ArrayList<String> omiljenaHrana;
    private String staniste;
    private int maksBrojJajaUGnezdu;

    public Ptica(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJajaUGnezdu) {
        this.minRasponKrila = minRasponKrila;
        this.maxRasponKrila = maxRasponKrila;
        this.omiljenaHrana = omiljenaHrana;
        this.staniste = staniste;
        this.maksBrojJajaUGnezdu = maksBrojJajaUGnezdu;
    }

    public Ptica(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    public double getMinRasponKrila() {
        return minRasponKrila;
    }

    public void setMinRasponKrila(double minRasponKrila) {
        this.minRasponKrila = minRasponKrila;
    }

    public double getMaxRasponKrila() {
        return maxRasponKrila;
    }

    public void setMaxRasponKrila(double maxRasponKrila) {
        this.maxRasponKrila = maxRasponKrila;
    }

    public ArrayList<String> getOmiljenaHrana() {
        return omiljenaHrana;
    }

    public void setOmiljenaHrana(ArrayList<String> omiljenaHrana) {
        this.omiljenaHrana = omiljenaHrana;
    }

    public String getStaniste() {
        return staniste;
    }

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }

    public int getMaksBrojJajaUGnezdu() {
        return maksBrojJajaUGnezdu;
    }

    public void setMaksBrojJajaUGnezdu(int maksBrojJajaUGnezdu) {
        this.maksBrojJajaUGnezdu = maksBrojJajaUGnezdu;
    }

    public double generateRasponKrila() {
        return 0;
    }

    public double getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(double rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    @Override
    public String toString() {
        return "Ptica{" +
                "minRasponKrila=" + minRasponKrila +
                ", maxRasponKrila=" + maxRasponKrila +
                ", rasponKrila=" + rasponKrila +
                ", omiljenaHrana=" + omiljenaHrana +
                ", staniste='" + staniste + '\'' +
                ", maksBrojJajaUGnezdu=" + maksBrojJajaUGnezdu +
                '}';
    }

}