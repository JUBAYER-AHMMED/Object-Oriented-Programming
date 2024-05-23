import java.util.Scanner;


class BankAccount {
   private String ownerName;
   private double balance;


   // Constructor to initialize the ownerName and balance
   public BankAccount(String name, double initialBalance) {
       ownerName = name;
       balance = initialBalance;
   }


   // Display account information
   public void displayInfo() {
       System.out.println("Owner Name: " + ownerName);
       System.out.println("Balance: $" + balance);
   }


   public void deposit(double amount) {
       balance += amount;
       System.out.println("Deposit of $" + amount + " successful.");
   }


   public void withdraw(double amount) {
       if (balance >= amount) {
           balance -= amount;
           System.out.println("Withdrawal of $" + amount + " successful.");
       } else {
           System.out.println("Insufficient funds!");
       }
   }
}


public class Lab11 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       BankAccount account = null;


       // Get the owner name and initial balance from the user
       System.out.print("Enter owner name: ");
       String name = scanner.nextLine();


       System.out.print("Enter initial balance: ");
       double initialBalance = scanner.nextDouble();
       scanner.nextLine(); // Consume newline


       // Creating a BankAccount object with initial values using the constructor
       account = new BankAccount(name, initialBalance);


       // Display initial account information
       System.out.println("\nInitial Account Information:");
       account.displayInfo();
       System.out.println();


       // Get deposit amount from the user and perform deposit
       System.out.print("Enter amount to deposit: ");
       double depositAmount = scanner.nextDouble();
       account.deposit(depositAmount);


       // Get withdraw amount from the user and perform withdrawal
       System.out.print("Enter amount to withdraw: ");
       double withdrawAmount = scanner.nextDouble();
       account.withdraw(withdrawAmount);


       // Display updated account information
       System.out.println("\nUpdated Account Information:");
       account.displayInfo();


       scanner.close();
   }
}
