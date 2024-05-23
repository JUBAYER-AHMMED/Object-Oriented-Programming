#include <iostream>
using namespace std;
class Sum{
    int a, b, c, sum;

    public:
    Sum(int num1,int num2,int num3){
        sum = num1 + num2 + num3;

    }
    void display(){
        cout<<"The sum is : "<< sum<<endl;
    }
};
int main()
{
    int number1,number2,number3;
    cout<<"Enter three numbers : ";
    cin>>number1>>number2>>number3;

    Sum object(number1,number2,number3);
    object.display();
    
    return 0;
}
