/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technova_bankingapplication;

/**
 *
 * @author user
 */
public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String pin;
    
    public BankAccount (
            String accountNumber,
            String accountHolder,
            double balance,
            String pin
    ) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public boolean authenticate(String enteredPin) {
        return pin.equals(enteredPin);
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
        throw new IllegalArgumentException (
        "Deposit amount must be greater than zero."
        );
    }
    
    balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
            "Insufficient funds."
            );
        }
        
        balance -= amount;
    }
    
    public void displayeBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance: R%.2f%n", balance);
    }

}
