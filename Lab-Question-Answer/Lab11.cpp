#include <iostream>
#include <string>
using namespace std;


class BankAccount {
private:
   string ownerName;
   double balance;


public:
   // Constructor to initialize the ownerName and balance
   BankAccount(const string& name, double initialBalance) {
       ownerName = name;
       balance = initialBalance;
   }


   // Function to display account information
   void displayInfo() const {
       cout << "Owner Name: " << ownerName << endl;
       cout << "Balance: $" << balance << endl;
   }


   // Function to deposit money into the account
   void deposit(double amount) {
       balance += amount;
       cout << "Deposit of $" << amount << " successful." << endl;
   }


   // Function to withdraw money from the account
   void withdraw(double amount) {
       if (balance >= amount) {
           balance -= amount;
           cout << "Withdrawal of $" << amount<<" successful."<<endl;
       } else {
           cout << "Insufficient funds!" << endl;
       }
   }
};


int main() {
   string name;
   double initialBalance;
   double depositAmount;
   double withdrawAmount;


   // Get the owner name and initial balance from the user
   cout << "Enter owner name: ";
   getline(cin, name);


   cout << "Enter initial balance: ";
   cin >> initialBalance;


   // Creating a BankAccount object with initial values using the constructor
   BankAccount account(name, initialBalance);


   // Display initial account information
   cout << "\nInitial Account Information:" << endl;
   account.displayInfo();
   cout << endl;


   // Get deposit amount from the user and perform deposit
   cout << "Enter amount to deposit: ";
   cin >> depositAmount;
   account.deposit(depositAmount);


   // Get withdraw amount from the user and perform withdrawal
   cout << "Enter amount to withdraw: ";
   cin >> withdrawAmount;
   account.withdraw(withdrawAmount);


   // Display updated account information
   cout << "\nUpdated Account Information:" << endl;
   account.displayInfo();


   return 0;
}
