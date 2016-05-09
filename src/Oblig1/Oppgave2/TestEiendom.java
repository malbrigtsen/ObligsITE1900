package Oblig1.Oppgave2;

public class TestEiendom {
    public static void main(String[] args) {
        Enebolig eb1 = new Enebolig("Marihandstien 2", "Ole Joan Olsen", 1100000, 204,
                23, 400, Enebolig.FRITTSTAAENDE);
        eb1.nyttBud("Ole Pedersen", 2400000, "90522355", 24);
        eb1.nyttBud("John McIntosh", 2500000, "90822655", 12);
        eb1.skrivAlleBud();
    }
}
