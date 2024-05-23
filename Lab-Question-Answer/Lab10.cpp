#include <iostream>
#include <string>
using namespace std;

class Grade {
    string subjectName;
    double marks;
public:
    Grade() {}
    void setData(string s, double m) {
        subjectName = s;
        marks = m;
    }
    string getName() {
        return subjectName;
    }
    double calGradepoint() const {
        double point;
        string result;

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
        }

        cout << "Your gradepoint in " << subjectName << " = " << point << "\n";
        cout << "You got " << result << " in " << subjectName << endl;
        return point;
    }

    static double calculateGPA(Grade *ptr, int size) {
        double GPA = 0.0;
        for (int i = 0; i < size; ++i) {
            GPA += (ptr + i)->calGradepoint();
        }
        return GPA / size;
    }
};

int main() {
    int size;
    cout << "How many subjects do you have?" << "\n";
    cin >> size;

    string sub;
    double score;

    Grade *ptr = new Grade[size];
    for (int i = 0; i < size; i++) {
        cout << "Enter the subject name and score: " << endl;
        cin >> sub >> score;
        (ptr + i)->setData(sub, score);
    }
    cout << "------------" << endl;

    double GPA = Grade::calculateGPA(ptr, size);
    cout << "Your overall GPA is = " << GPA << endl;

    delete[] ptr;
    return 0;
}