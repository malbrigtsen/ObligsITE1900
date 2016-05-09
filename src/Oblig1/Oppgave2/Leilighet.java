package Oblig1.Oppgave2;

public class Leilighet extends Eiendom {
    private double fellesGjeld;
    private double husleie;
    private int etg;
    public Leilighet(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr, double fellesGjeld, double husleie, int etg) {
        super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
        this.fellesGjeld=fellesGjeld;
        this.husleie=husleie;
        this.etg= etg;
    }
    @Override
    public String toString(){
        return String.format("Adresse: %s Eiers navn: %s Takst: %s Antall kvm: %s Gnr: %s Bnr: %s Fellesgjeld: %s Husleie: %s Etasje: %s", getAdresse(), getEiersNavn(), getTakst(), getAntKvm(), getGnr(), getBnr(), fellesGjeld, husleie, etg);
    }
    @Override
    public void skrivAlleBud() {
        System.out.print("Bud gitt for enebolig: ");
        toString();
        super.skrivAlleBud();
        System.out.println();
        {
        }
    }
}
