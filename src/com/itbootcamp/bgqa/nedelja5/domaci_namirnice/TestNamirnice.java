package com.itbootcamp.bgqa.nedelja5.domaci_namirnice;


import java.util.ArrayList;

public class TestNamirnice {
    public static void main(String[] args) {
        ArrayList<Namirnica>namirnice = new ArrayList<>();

        Namirnica n1 = new Namirnica("Jaja",250);
        Namirnica n2 = new Namirnica("Meso",600);
        Namirnica n3 = new Namirnica("Cokolada",100);
        Namirnica n4 = new Namirnica("Brasno",85);
        Namirnica n5 = new Namirnica("Banane",199);
        Namirnica n6 = new Namirnica("Riba",900);

        namirnice.add(n1);
        namirnice.add(n2);
        namirnice.add(n3);
        namirnice.add(n4);
        namirnice.add(n5);
        namirnice.add(n6);

        Korpa k = new Korpa(namirnice);

        for (Namirnica n:namirnice) {
            k.printRacun();
        }

        System.out.println(namirnice);
        System.out.println("Suma svih namirnica je: " +k.printRacun());
    }
}
