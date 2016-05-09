package Oblig2.Versjon234;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrayList<Kort> kortArray = new ArrayList<>();
        Kort k1 = new Ansatt("Ole Olsen", 1234);
        Kort k2 = new Gjest("Marit Olsen", 9999);
        Kort k3 = new Gjest("Jostein Karlsen", 9999);
        Kort k4 = new Gjest("Hanne Pettersen", 9999);
        Kort k5 = new Ansatt("Anne Karlsen", 5678);
        Kort k6 = new Ansatt("Per Person", 9012);
        kortArray.add(k1);
        kortArray.add(k2);
        kortArray.add(k3);
        kortArray.add(k4);
        kortArray.add(k5);
        kortArray.add(k6);
        for (Kort kort : kortArray) {
            System.out.println(kort);
            System.out.println("Kode 1234 er " + (kort.sjekkPin(1234) ? "gyldig" : "ugyldig"));
            System.out.println("Kode 5678 er " + (kort.sjekkPin(5678) ? "gyldig" : "ugyldig"));
            System.out.println("Kode 9012 er " + (kort.sjekkPin(9012) ? "gyldig" : "ugyldig"));
            System.out.println("Kode 9999 er " + (kort.sjekkPin(9999) ? "gyldig" : "ugyldig"));
        }
        kortArray.sort(null);
        for (Kort kort : kortArray) {
            System.out.println(kort);
        }
        Kort k7 = k3.clone();
        System.out.println(k7 + " er en klone av: \n" + k3);
        System.out.println(k5.compareTo(k3));
        System.out.println(k3.compareTo(k1));
    }
}
