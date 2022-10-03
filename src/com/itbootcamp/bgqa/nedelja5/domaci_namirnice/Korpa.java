package com.itbootcamp.bgqa.nedelja5.domaci_namirnice;

import java.util.ArrayList;

public class Korpa implements Racun{

    private ArrayList<Namirnica> namirnice;

    public Korpa(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    @Override
    public void printNamirnice() {
        for (Namirnica n: namirnice) {
            System.out.println(n);
        }

    }

    @Override
    public int printRacun() {
        int suma = 0;
        for (Namirnica n:namirnice) {
            suma+= n.getCena();
        }
        return suma;
    }

    @Override
    public boolean jeNaSpisku(Namirnica n) {
        for (Namirnica nam:namirnice) {
            if(nam.compareTo(n) ==0){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }
}
