#include <iostream>
#include <iomanip>
using namespace std;
class Pattern{
    public:
    // Function of Pascal's Triangle
    void PascalsTriangle(int n) {
    int arr[n][n];

    //for space
    for (int line = 0; line < n; line++) {
        for (int i = 1; i < n-line; i++)
        {
            cout<<"  ";
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
            cout << setw(4) << arr[line][i];
        }
        cout << endl;
    }
}
};

int main() {
    int n;
    // Number of lines
    cout<<"How many lines there are in your Pascal's triangle ?"<<endl;
    cin>>n;

    Pattern obj;

    obj.PascalsTriangle(n);
    return 0;
}
