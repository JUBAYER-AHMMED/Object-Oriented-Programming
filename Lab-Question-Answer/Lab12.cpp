#include <iostream>
#include <string>
using namespace std;
class Person {
protected:
   string name;
   int age;
public:
   Person(string name, int age) : name(name), age(age) {}
   void display() {
       cout << "Name: " << name << endl;
       cout << "Age: " << age << endl;
   }
};
class Employee : public Person {
private:
   double salary;
public:
   Employee(string name, int age, double salary) : Person(name, age), salary(salary) {}
   void displaySalary() {
       cout << "Salary: $" << salary << endl;
   }
};


int main() {
   string name;
   int age;
   double salary;


   cout<<"What is your name :";
   cin>>name;
   cout<<"Your age : ";
   cin>>age;
   cout<<"Your salary : ";
   cin>>salary;


   cout<<"---------------"<<endl;
   Employee emp(name, age, salary);
   emp.display();
   emp.displaySalary();
   return 0;
}
