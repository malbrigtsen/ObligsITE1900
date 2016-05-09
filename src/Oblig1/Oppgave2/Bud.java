package Oblig1.Oppgave2;

import java.util.GregorianCalendar;
public class Bud {
    private GregorianCalendar budGitt;
    private GregorianCalendar budFrist;
    private float belop;
    private String navn;
    private String telefon;
    public Bud(GregorianCalendar budGitt){
        this.budGitt=budGitt;
    }
    public Bud(String navn, String telefon, float belop, int budFrist) {
        this.budFrist = new GregorianCalendar();
        this.budGitt = new GregorianCalendar();
        this.budFrist.add(GregorianCalendar.HOUR, budFrist);
        this.belop = belop;
        this.navn = navn;
        this.telefon = telefon;
    }
    @Override
    public String toString (){
        return String.format ("%s, Budfrist: %s, Navn: %s, Telefon: %s BelÃ¸p: %s" ,budGitt.getTime().toString(), this.budFrist.getTime().toString(), navn, telefon, belop );
    }
}

