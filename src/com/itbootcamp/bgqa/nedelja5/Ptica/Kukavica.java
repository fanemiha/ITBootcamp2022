package com.itbootcamp.bgqa.nedelja5.Ptica;

import java.util.ArrayList;

public class Kukavica extends Ptica{

    public Kukavica(double minRasponKrila, double maxRasponKrila, ArrayList<String> omiljenaHrana, String staniste, int maksBrojJajaUGnezdu) {
        super(minRasponKrila, maxRasponKrila, omiljenaHrana, staniste, maksBrojJajaUGnezdu);
    }

    public Kukavica(double rasponKrila) {
        super(rasponKrila);
    }
}
