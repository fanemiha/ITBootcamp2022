package com.itbootcamp.bgqa.nedelja5.Ptica;

import java.util.ArrayList;

public class Orao extends Ptica{

    public Orao(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJajaUGnezdu) {
        super(minRasponKrila, maxRasponKrila, omiljenaHrana, staniste, maksBrojJajaUGnezdu);
    }

    public Orao(double rasponKrila) {
        super(rasponKrila);
    }
}
