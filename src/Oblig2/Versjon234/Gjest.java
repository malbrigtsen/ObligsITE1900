package Oblig2.Versjon234;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gjest extends Kort {
    protected Calendar date;
    protected GregorianCalendar expireDate;
    Gjest() {
    }
    Gjest(String navn, int pin) {
        this.navn = navn;
        this.pinKode = pin;
        this.type="Gjest";
        this.date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);
        expireDate = new GregorianCalendar(year, month, day);
    }
    @Override
    protected boolean sjekkPin(int pin) {
        boolean result = false;
        long tempA = this.date.getTimeInMillis();
        long tempB = this.expireDate.getTimeInMillis();
        if (pin == 9999) {
            if (tempA > tempB) {
                result = true;
            }
        } else {
            result = false;
        }
        return result;
    }
}
