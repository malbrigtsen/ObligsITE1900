package Oblig2.Versjon234;

public abstract class Kort implements Comparable<Kort>, Cloneable {
    protected String navn;
    protected int pinKode;
    protected String type;
    protected int kortnummer;
    protected boolean aksesskode;
    long intArray[] = new long[100];
    Kort() {
        this.aksesskode = false;
        this.kortnummer = unikKnr();
    }
    protected String getNavn() {
        return this.navn;
    }
    protected String getEtternavn() {
        String[] arr = getNavn().split(" ", 2);
        return arr[1];
    }
    protected String getFornavn() {
        String[] arr = navn.split(" ", 2);
        return arr[0];
    }
    protected boolean isSperret() {
        return this.aksesskode;
    }
    public String toString() {
        return (getNavn() + " " + this.pinKode + " " + this.kortnummer + " " + this.aksesskode);
    }
    protected abstract boolean sjekkPin(int pin);
    public static int knrGen() {
        int number = (int) Math.floor(Math.random() * 90000000) + 10000000;
        return number;
    }
    public int unikKnr() {
        int testNr = knrGen();
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == testNr) {
                i = 0;
                testNr = knrGen();
            }
        }
        return testNr;
    }
    public int compareTo(Kort k) {
        int BEFORE = -1;
        int NaN = 0;
        int AFTER = 1;
        if (this.getEtternavn() != k.getEtternavn()) {
            if (this.getEtternavn().compareTo(k.getEtternavn()) >= BEFORE)
                return BEFORE;
            if (this.getEtternavn().compareTo(k.getEtternavn()) <= AFTER)
                return AFTER;
        } else if (this.getEtternavn() == k.getEtternavn()) {
            if (this.getFornavn().compareTo(k.getFornavn()) >= BEFORE)
                return BEFORE;
            if (this.getFornavn().compareTo(k.getFornavn()) <= AFTER)
                return AFTER;
        }
        return NaN;
    }
    public Kort clone(){
        Kort kortClone = null;
        if (this.type == "Ansatt") {
            kortClone = new Ansatt(this.navn, this.pinKode);
            kortClone.kortnummer = this.kortnummer;
            kortClone.aksesskode = this.aksesskode;
        } else if (this.type == "Gjest") {
            kortClone = new Gjest(this.navn, this.pinKode);
            kortClone.kortnummer = this.kortnummer;
            kortClone.aksesskode = this.aksesskode;
        }
        return kortClone;
    }
}
