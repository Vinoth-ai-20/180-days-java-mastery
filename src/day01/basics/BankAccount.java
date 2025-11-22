package day01.basics;

public class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }

    boolean hasSufficientAmount(double amount){
        return balance > amount;
    }
}
