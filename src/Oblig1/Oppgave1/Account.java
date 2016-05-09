package Oblig1.Oppgave1;

import java.util.ArrayList;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 0;
    private String name;
    static ArrayList transaction = new ArrayList();
    Account(int id, double balance, double annualInterestRate, String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
    }
    int getId() {
        return id;
    }
    private String getName() {
        return name;
    }
    double getMonthlyInteresRate() {
        return balance * MonthlyInteresRate();
    }
    private double MonthlyInteresRate() {
        return (annualInterestRate / 100) / 12;
    }
    double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Account account1 = new Account(1122, 1000, 1.5, "George");
        transaction.add(+30);
        transaction.add(+40);
        transaction.add(+50);
        transaction.add(-5);
        transaction.add(-4);
        transaction.add(-2);
        System.out.println("Id: " + account1.getId() + "\n" +
                "the name is: " + account1.getName() + "\n" +
                "the balance is: " + account1.getBalance() + "\n" +
                "the monthly interest is: " + account1.getMonthlyInteresRate() + "\n" +
                "the transactions: " + transaction + "\n");
        System.out.println("------------------Transaction 1.-----------------");
        Transaction transaction1 = new Transaction(30,1000,'D');
        System.out.println("the transaction was: " + transaction1.getDescription()+ "\n"+
                "the balance is now " + transaction1.getBalance() + "\n" +
                "date: "+ transaction1.dateCreated);
        System.out.println("------------------Transaction 2.-----------------");
        Transaction transaction2 = new Transaction(40,1000+30,'D');
        System.out.println("the transaction was: " + transaction2.getDescription()+ "\n"+
                "the balance is now " + transaction2.getBalance()+ "\n" +
                "date: "+ transaction2.dateCreated);
        System.out.println("------------------Transaction 3.-----------------");
        Transaction transaction3 = new Transaction(50,1000+30+40,'D');
        System.out.println("the transaction was: " + transaction3.getDescription()+ "\n"+
                "the balance is now " + transaction3.getBalance()+ "\n" +
                "date: "+ transaction3.dateCreated);
        System.out.println("------------------Transaction 4.-----------------");
        Transaction transaction4 = new Transaction(-5,1000+30+40+50,'W');
        System.out.println("the transaction was: " + transaction4.getDescription()+ "\n"+
                "the balance is now " + transaction4.getBalance()+ "\n" +
                "date: "+ transaction4.dateCreated);
        System.out.println("------------------Transaction 5.-----------------");
        Transaction transaction5 = new Transaction(-4,1000+30+40+50-5,'W');
        System.out.println("the transaction was: " + transaction5.getDescription()+ "\n"+
                "the balance is now " + transaction5.getBalance()+ "\n" +
                "date: "+ transaction5.dateCreated);
        System.out.println("------------------Transaction 6.-----------------");
        Transaction transaction6 = new Transaction(-2,1000+30+40+50-5-4,'W');
        System.out.println("the transaction was: " + transaction6.getDescription()+ "\n"+
                "the balance is now " + transaction6.getBalance()+ "\n" +
                "date: "+ transaction6.dateCreated);
    }
}
