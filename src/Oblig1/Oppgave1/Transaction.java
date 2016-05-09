package Oblig1.Oppgave1;

public class Transaction {
    public double amount;
    public double balance;
    public char description;
    Transaction(double amount, double balance, char descripiton){
        this.amount = amount;
        this.balance = balance;
        this.description = descripiton;
    }
    double getBalance(){
        return balance += amount;
    }
    char getDescription(){
        return description;
    }
    java.util.Date dateCreated = new java.util.Date();
}
