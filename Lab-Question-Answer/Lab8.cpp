#include <iostream>
#include <cmath>
using namespace std;

class VolumeCalculator {
public:
    // Method to calculate volume of a sphere
    double volumeSphere(double radius) {
        return (4.0 / 3.0) * M_PI * pow(radius, 3);
    }

    // Method to calculate volume of a cube
    double volumeCube(double side) {
        return pow(side, 3);
    }

    // Method to calculate volume of a cylinder
    double volumeCylinder(double radius, double height) {
        return M_PI * pow(radius, 2) * height;
    }
};

int main() {
    VolumeCalculator calculator;

    double radius, side, height;

    // Sphere
    cout << "Enter the radius of the sphere: ";
    cin >> radius;
    cout << "Volume of the sphere: " << calculator.volumeSphere(radius) << endl;

    // Cube
    cout << "Enter the side length of the cube: ";
    cin >> side;
    cout << "Volume of the cube: " << calculator.volumeCube(side) << endl;

    // Cylinder
    cout << "Enter the radius of the cylinder: ";
    cin >> radius;
    cout << "Enter the height of the cylinder: ";
    cin >> height;
    cout << "Volume of the cylinder: " << calculator.volumeCylinder(radius, height) << endl;

    return 0;
}