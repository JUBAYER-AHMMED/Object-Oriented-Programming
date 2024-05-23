import java.util.Scanner;
class Grade {
    String subjectName;
    double marks;
    public Grade() {}
    public void setData(String s, double m) {
        subjectName = s;
        marks = m;
    }
    public String getName() {
        return subjectName;
    }
    public double calGradepoint() {
        double point;
        String result;

        if (marks >= 80 && marks <= 100) {
            point = 5.0;
            result = "A+";
        } else if (marks >= 75 && marks < 80) {
            point = 4.5;
            result = "A";
        } else if (marks >= 70 && marks < 75) {
            point = 4.0;
            result = "A-";
        } else if (marks >= 60 && marks < 70) {
            point = 3.5;
            result = "B+";
        } else if (marks >= 55 && marks < 60) {
            point = 3.0;
            result = "B";
        } else if (marks >= 50 && marks < 55) {
            point = 2.5;
            result = "C";
        } else if (marks >= 40 && marks < 50) {
            point = 2.0;
            result = "D";
        } else if (marks >= 0 && marks < 40) {
            point = 0.0;
            result = "F";
        } else {
            point = 0.0;
            result = "Invalid marks";
        }
        System.out.println("Your gradepoint in " + subjectName + " = " + point);
        System.out.println("You got " + result + " in " + subjectName);
        return point;
    }
    public static double calculateGPA(Grade[] grades) {
        double GPA = 0.0;
        for (Grade grade : grades) {
            GPA += grade.calGradepoint();
        }
        return GPA / grades.length;
    }
}
public class Lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many subjects do you have? ");
        int size = scanner.nextInt();

        Grade[] grades = new Grade[size];
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the subject name and score: ");
            String sub = scanner.next();
            double score = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            grades[i] = new Grade();
            grades[i].setData(sub, score);
        }
        System.out.println("------------");
        double GPA = Grade.calculateGPA(grades);
        System.out.println("Your overall GPA is = " + GPA);
    }
}