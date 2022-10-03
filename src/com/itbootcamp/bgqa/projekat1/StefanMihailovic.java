package com.itbootcamp.bgqa.projekat1;

import java.util.Arrays;
import java.util.Scanner;

public class StefanMihailovic {
    public static void main(String[] args) {

        System.out.println("*****POCETAK PROGRAMA*****");

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        nizInt(sc, duzinaNiza);
        nizString(sc,duzinaNiza);
        nizChar(sc,duzinaNiza);

        System.out.println(zbirCifara(25));

        System.out.println(stepenBroja(625, 25));

        int[] niz = {1,1,1,3,3,3,4,5,6,0,9,11,0,44,52,0,62};
        System.out.println(Arrays.toString(zbirIndexaNizaMeta(niz, 5)));

        System.out.println("Binarni format unetog broja je: " + toBinary(5));

        System.out.println("Broj ponavljanja je: " +
                brojPonavljanja("hej", "hej sta ima kako si ti hej ja sam dobro"));

        System.out.println(Arrays.toString(pomeriNule(niz)));

        System.out.println(Arrays.toString(izbaciDuplikate(niz)));

        System.out.println("*****KRAJ PROGRAMA*****");
    }

    //***METODE***

    /*//0.Implementirati metode za unos elemenata niza varijabilne dužine.
    // Elementi treba da budu tipa int, String i char.
    public static int [] unesiNizInt(){
    }*/
    public static void nizInt (Scanner sc, int duzinaNiza){
        int[] nizInt = new int[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite elemente niza: ");
            nizInt[i] = sc.nextInt();
        }
        System.out.println("Niz int je: " + Arrays.toString(nizInt));
    }
    public static void nizString (Scanner sc, int duzinaNiza){
        String [] nizString = new String[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite elemente niza: ");
            nizString[i] = sc.next();
        }
        System.out.println("Niz string je: " + Arrays.toString(nizString));
    }

    public static void nizChar (Scanner sc, int duzinaNiza) {
        char[] nizChar = new char[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite elemente niza: ");
            String unos = sc.next();
            nizChar[i] = unos.charAt(0);
        }
        System.out.println("Niz char je: " + Arrays.toString(nizChar));
    }
    //1. Implementirati metodu int zbirCifara(int n) koja sabira cifre sve dok rezultat ne bude samo jedna cifra.
    //Npr. 1234 -> 1, 43 -> 7, 55 -> 1, 556 -> 7
    public static int zbirCifara(int n) {
        int suma = 0;
        while (n > 0 || suma > 9) {
            if (n == 0) {
                n = suma;
                suma = 0;
            }
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma;
    }
    //2. Implementirati metodu boolean stepenBroja(int n, int m) koja vraća true ukoliko je n stepen broja m.
    //Npr: (9, 3) -> true, (125, 5) -> true, (13, 4) -> false
    public static boolean stepenBroja(int n, int m) {
        int stepen = 1;
        while (stepen < n)
            stepen = stepen * m;
        return (stepen == n);
    }
    //3.Implementirati metodu int[] zbirIndexaNizaMeta(int[] niz, int meta) koja vraća indekse
    //dva elementa koji kada se saberu daju rezultat koji je jednak meti.
    //Npr. ({2, 3, 10, -2}, 5) -> {0, 1}
    public static int[] zbirIndexaNizaMeta(int[] niz, int meta){
        int[] rezultat = new int[2];
        for(int i = 0; i < niz.length; i++) {
            for(int j = i + 1; j < niz.length; j++) {
                if (niz[i] + niz[j] == meta) {
                    rezultat[0] = i;
                    rezultat[1] = j;
                }
            }
        }
        return rezultat;
    }
    //4. Implementirati metodu String toBinary(int n) koja vraća broj n u binarnom formatu. Uzeti apsolutnu vredost n.
    //Npr. 10 -> 1010, 100 -> 1100100
    public static String toBinary(int n){
        String binarniFormat = " ";
        while (n >0 ) {
            if (n %2==0) {
                binarniFormat = 0 + binarniFormat;
            } else {
                binarniFormat = 1 + binarniFormat;
            }
            n = n / 2;
        }
        return binarniFormat;
    }
    //5. Implementirati metodu int brojPonavljanja(String s, String recenica) koja vraća broj ponavljanja stringa "s" u rečenici.
    //Hint: istražiti s.split("") metodu.
    //Npr. ("cao", "cao kako si cao") -> 2
    public static int brojPonavljanja(String s, String recenica) {
        int rezultat = 0;
        String[] nizRazdvojen = recenica.split(" ");

        for (int i = 0; i < nizRazdvojen.length; i++){
            if (nizRazdvojen[i].equals(s)) {
                rezultat++;
            }
        }
        return rezultat;
    }
    //6. Implementirati metodu int[] pomeriNule(int[] niz) koja vraća niz u kome su sve nule pomerene na kraj niza.
    //Npr. {1, 0, 0, 2, 3} -> {1, 2, 3, 0, 0}
    public static int[] pomeriNule(int[] niz) {
        int brojac = 0;
        int[] niz2 = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != 0) {
                niz2[brojac] = niz[i];
                brojac++;
            }
        }
        while( brojac < niz.length){
            niz2[brojac] = 0;
            brojac++;
        }
        return niz2;
    }
    //7. Implementirati metodu int[] izbaciDuplikate(int[] niz) koja vraća niz bez duplikata.
    //Npr. {1, 2, 3, 3} -> {1, 2, 3}, {3, 4, 3, 4, 3, 4, 5} -> {3, 4, 5}
    public static int[] izbaciDuplikate(int[] niz) {
        int k = 0;
        for (int i = 0; i < niz.length; i++) {
            if (i ==0 || niz[i] != niz[i - 1]) {
                niz[k] = niz[i];
                k++;
            }
        }
        return Arrays.copyOf(niz, k);
    }
}
