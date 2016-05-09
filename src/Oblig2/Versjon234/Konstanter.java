package Oblig2.Versjon234;

public interface Konstanter {
    // konstant
    int kredittFaktor = 2;
    int ansiennitetFaktor = 2;
    public void settFornavn(String i);
    public String hentFornavn();
    public void settEtternavn(String i);
    public String hentEtternavn();
    public void settFulltNavn(String i);
    public String hentFulltnavn();
    public double beregnKreditt();
    public double beregnBonus();
}
