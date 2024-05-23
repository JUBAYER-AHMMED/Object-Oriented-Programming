import java.util.Scanner;

class Pascal{

    // Function of Pascal's Triangle
    public static void PascalsTriangle(int n) {
        int[][] arr = new int[n][n];

        for (int line = 0; line < n; line++) {
            //spaces for alignment
            for (int i = 1; i < n - line; i++) {
                System.out.print("  ");
            }

            for (int i = 0; i <= line; i++) {
                // First and last values in every row are 1
                if (line == i || i == 0) {
                    arr[line][i] = 1;
                } else {
                    // Other values are sum of values just above and left of above
                    arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
                }
                // Print the current value with appropriate spacing
                System.out.printf("%4d", arr[line][i]);
            }
            System.out.println();
        }
    }
}

public class Lab9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines there are in your Pascal's triangle?");
        int n = scanner.nextInt();

        Pascal object = new Pascal();
        object.PascalsTriangle(n);
        scanner.close();
    }
    }
