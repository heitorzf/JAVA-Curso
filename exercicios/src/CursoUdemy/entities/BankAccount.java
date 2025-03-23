package entities;

import javax.security.auth.login.AccountException;

public class BankAccount {
    private String AccountNumber;
    private String name;
    private double InitialDeposit;

    public BankAccount (String AccountNumber , String name ) {
        this.AccountNumber = AccountNumber;
        this.name = name;

    }
    public BankAccount (String AccountNumber , String name , double InitialDeposit){
        this.AccountNumber = AccountNumber;
        this.name = name;
        deposit(InitialDeposit);
    }
    public void deposit(double amount) {
        InitialDeposit += amount ;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
    public String getName(){
        return name;
    }
    public double getInitialDeposit(){
        return InitialDeposit;
    }
    public void withdraw(double amount) {
        InitialDeposit -= amount + 5;
    }
    public String toString() {
        return "Account " + AccountNumber
                + " ," + name + ", " + InitialDeposit;
    }
    public void setName(String name){
        this.name = name;
    }

}
