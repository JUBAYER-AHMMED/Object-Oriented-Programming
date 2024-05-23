import java.util.Scanner;


class Person {
   protected String name;
   protected int age;


   public Person(String name, int age) {
       this.name = name;
       this.age = age;
   }


   public void display() {
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
   }
}


class Employee extends Person {
   private double salary;


   public Employee(String name, int age, double salary) {
       super(name, age);
       this.salary = salary;
   }


   public void displaySalary() {
       System.out.println("Salary: $" + salary);
   }
}


public class Lab12 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.print("What is your name: ");
       String name = scanner.next();
       System.out.print("Your age: ");
       int age = scanner.nextInt();
       System.out.print("Your salary: ");
       double salary = scanner.nextDouble();


       System.out.println("---------------");


       Employee emp = new Employee(name, age, salary);
       emp.display();
       emp.displaySalary();


       scanner.close();
   }
}
