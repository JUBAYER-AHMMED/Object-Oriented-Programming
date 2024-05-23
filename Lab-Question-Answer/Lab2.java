import java.util.Scanner;

class Sum {
    int a, b, c, sum;

    // Constructor to calculate the sum
    public Sum(int num1, int num2, int num3) {
        sum = num1 + num2 + num3;
    }

    // Method to display the sum
    public void display() {
        System.out.println("The sum is: " + sum);
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        Sum object = new Sum(number1, number2, number3);
        object.display();
        
        scanner.close();
    }
}
