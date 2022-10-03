package com.itbootcamp.bgqa.nedelja5.Ptica;

import java.util.ArrayList;

public class Albatros extends Ptica{

    public Albatros(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJajaUGnezdu) {
        super(minRasponKrila, maxRasponKrila, omiljenaHrana, staniste, maksBrojJajaUGnezdu);
    }

    public Albatros(double rasponKrila) {
        super(rasponKrila);
    }
}
