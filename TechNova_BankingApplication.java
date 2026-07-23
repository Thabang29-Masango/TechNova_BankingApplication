/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package technova_bankingapplication;

/**
 * TechNova_BankingApplication
 * @Thabang Kenneth Masango
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class TechNova_BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BankAccount account = new BankAccount(
                "123456789",
                "Thabang Kenneth Masango",
                10000,
                "2341"
        );
        
        BankingSystem bankingSystem = new BankingSystem(account);
        
        System.out.println("===============================");
        System.out.println("     TECHNOVA BANKING SYSTEM");
        System.out.println("===============================");
        
        
       int attempts = 0;
       boolean loggedIn = false;

    while (attempts < 3 && !loggedIn) {

        System.out.print("Enter your PIN: ");
        String pin = input.nextLine();

        if (bankingSystem.login(pin)) {
           loggedIn = true;
           System.out.println("Login successful!");
      } else {
            attempts++;

             System.out.println("Invalid PIN!");

        if (attempts < 3) {
              System.out.println(
                      "Attempts remaining: " + (3 - attempts)
              );
         }
       }
    }

       if (!loggedIn) {
        System.out.println("\n=================================");
        System.out.println("Account has been locked.");
        System.out.println("Please visit your nearest branch.");
        System.out.println("=================================");
          input.close();
         return;
   }
        
        int choice = 0;
        
        do {
            System.out.println("\n====== MENU ===========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            
            System.out.print("Choose an option: ");
            
            try {
                choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: R");
                        double deposit = input.nextDouble();
                        
                        bankingSystem.deposit(deposit);
                        break;
                        
                  
                    case 2:
                        System.out.print("Enter amount to withdraw: R");
                        double withdraw = input.nextDouble();
                        
                        bankingSystem.withdraw(withdraw);
                        break;
                        
                    case 3:
                        bankingSystem.checkBalance();
                        
                        break;
                        
                        
                    case 4: 
                        System.out.println("Thank you for using TechNovaBankingApplication");
                        
                         break;
                         
                    default:
                        
                        System.out.println("Invalid option");
                        
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only.");
                input.nextLine();
                
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
    } while (choice != 4);
        input.close();
    }
    
}
