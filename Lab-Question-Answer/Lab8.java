import java.util.Scanner;

class VolumeCalculator {
    // Method to calculate volume of a sphere
    public double volumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate volume of a cube
    public double volumeCube(double side) {
        return Math.pow(side, 3);
    }

    // Method to calculate volume of a cylinder
    public double volumeCylinder(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

public class Lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VolumeCalculator calculator = new VolumeCalculator();

        double radius, side, height;

        // Sphere
        System.out.println("Enter the radius of the sphere: ");
        radius = input.nextDouble();
        System.out.println("Volume of the sphere: " + calculator.volumeSphere(radius));

        // Cube
        System.out.println("Enter the side length of the cube: ");
        side = input.nextDouble();
        System.out.println("Volume of the cube: " + calculator.volumeCube(side));

        // Cylinder
        System.out.println("Enter the radius of the cylinder: ");
        radius = input.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        height = input.nextDouble();
        System.out.println("Volume of the cylinder: " + calculator.volumeCylinder(radius, height));
        
        
    }
}