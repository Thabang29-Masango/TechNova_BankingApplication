/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technova_bankingapplication;

/**
 *
 * @author user
 */
public class BankingSystem {
    private BankAccount account;
    
    public BankingSystem(BankAccount account) {
        this.account = account;
    }
    
    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful!");
    }
    
    public void withdraw(double amount) {
        account.withdraw(amount);
        System.out.println("Withdrawal successful!");
    }
    
    public void checkBalance() {
        account.displayeBalance();
    }
    
    public boolean login(String pin) {
        return account.authenticate(pin);
    }
}
