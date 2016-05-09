package Oblig1.Oppgave2;

import java.util.ArrayList;
public abstract class Eiendom {
    private String adresse;
    private String eiersNavn;
    private double takst;
    private int antKvm;
    private int gnr;
    private int bnr;
    private ArrayList<Bud> BudOversikt = new ArrayList<Bud>();
    public Eiendom(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr) {
        this.adresse = adresse;
        this.eiersNavn = eiersNavn;
        this.takst = takst;
        this.antKvm = antKvm;
        this.gnr = gnr;
        this.bnr = bnr;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getEiersNavn() {
        return eiersNavn;
    }
    public double getTakst() {
        return takst;
    }
    public int getAntKvm() {
        return antKvm;
    }
    public int getGnr() {
        return gnr;
    }
    public int getBnr() {
        return bnr;
    }
    public void nyttBud(String navn, float belop, String telefon, int budFrist) {
        BudOversikt.add(new Bud(navn, telefon, belop, budFrist));
    }
    public void skrivAlleBud() {
        System.out.println(this.toString());
        System.out.println("Bud gitt:\t\t\t\t\t\t Bud Frist:\t\t\t\t\t\t Navn:\t\t\t TLF:\t\t BelÃ¸p:");
        for (Bud bud : BudOversikt) {
            System.out.println(bud.toString());
        }
    }
    public String getSisteBud() {
        return String.format("Siste bud %s", BudOversikt.get(BudOversikt.size()-1));
    }
}
