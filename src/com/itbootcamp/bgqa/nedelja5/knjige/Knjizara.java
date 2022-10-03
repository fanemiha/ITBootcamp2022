package com.itbootcamp.bgqa.nedelja5.knjige;

import java.util.ArrayList;

public class Knjizara {

    private ArrayList<Knjiga> knjige;

    public Knjizara(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
    }
//napraviti metod koji izlistava sve knjige jednog autora
//public ArrayList<Knjiga> autoroveKnjige(String autor, ArrayList<Knjige> knjige)
    public ArrayList<Knjiga> autoroveKnige(String autor) {
        ArrayList<Knjiga> autoroveKnjige = new ArrayList<>();

        for (Knjiga knjigaUListi : this.knjige) {
            if (knjigaUListi.getAutor().equals(autor)) {
                autoroveKnjige.add(knjigaUListi);
            }
        }
        return autoroveKnjige;
    }

    //napraviti metod koji izlistava najbolje prodane knjige (sve knjige koje se prodale vise od 1000 kopija)
    //public ArrayList<Knjiga> bestSeller(ArrayList<Knjige> knjige) (edited)

    public ArrayList<Knjiga> bestSeller() {
        ArrayList<Knjiga> listaBestSellera = new ArrayList<>();

        for (Knjiga knjigaUListi : this.knjige) {
            if (knjigaUListi.getBrojProdatihKopija() >= 1000) {
                listaBestSellera.add(knjigaUListi);
            }
        }

        return listaBestSellera;
    }
}