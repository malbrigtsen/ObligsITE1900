package Oblig2.Versjon234;

import java.util.Calendar;
public class Ansatt extends Kort implements Konstanter {
    protected int årsAnsiennitet;
    protected double timeslønn;
    Ansatt() {
    }
    Ansatt(String navn, int pin) {
        this.navn = navn;
        this.pinKode = pin;
        this.type="Ansatt";
    }
    @Override
    protected boolean sjekkPin(int pin) {
        boolean result = false;
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        if (hours > 17) {
            if (pin == this.pinKode) {
                result = true;
            }
        } else if (hours < 07) {
            if (pin == this.pinKode) {
                result = true;
            }
        } else if (pin == this.pinKode) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    @Override
    public void settFornavn(String i) {
        String[] arr = navn.split(" ", 2);
        arr[0] = i;
        navn = arr[0] + " " + arr[1];
    }
    @Override
    public String hentFornavn() {
        String[] arr = navn.split(" ", 2);
        return arr[0];
    }
    @Override
    public void settEtternavn(String i) {
        String[] arr = getNavn().split(" ", 2);
        arr[1] = i;
        navn = arr[0] + " " + arr[1];
    }
    @Override
    public String hentEtternavn() {
        String[] arr = getNavn().split(" ", 2);
        return arr[1];
    }
    @Override
    public void settFulltNavn(String i) {
        navn = i;
    }
    @Override
    public String hentFulltnavn() {
        return getNavn();
    }
    @Override
    public double beregnKreditt() {
        return this.timeslønn * kredittFaktor;
    }
    @Override
    public double beregnBonus() {
        return this.årsAnsiennitet * ansiennitetFaktor;
    }
}
