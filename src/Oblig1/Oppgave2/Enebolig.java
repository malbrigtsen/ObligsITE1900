package Oblig1.Oppgave2;

public class Enebolig extends Eiendom {
    public static final int FRITTSTAAENDE = 1;
    public static final int REKKE = 2;
    public static final int TOMANNS = 3;
    private int type;
    public Enebolig(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr, int type) {
        super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
        this.type = type;
    }
    public String getTypeAsString() {
        switch (type) {
            case FRITTSTAAENDE:
                return "FrittstÃ¥ende";
            case REKKE:
                return "Rekke";
            case TOMANNS:
                return "Tomanns";
            default:
                return "Ukjent verdi";
        }
    }
    @Override
    public String toString(){
        return String.format("Adresse: %s Eiers navn: %s Takst: %s Antall kvm: %s Gnr: %s Bnr: %s Type: %s", getAdresse(), getEiersNavn(), getTakst(), getAntKvm(), getGnr(), getBnr(), type);
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