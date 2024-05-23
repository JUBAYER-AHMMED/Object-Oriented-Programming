#include <iostream>
using namespace std;
class Triangle
{
public:
   double width;
   double height;
   Triangle(double width, double height)
   {
       this->height = height;
       this->width = width;
   }
   double area()
   {
       return .5 * width * height;
   }
};
int main()
{
   double h, w , a;
   cout << "Enter the Height and Width :" << endl;
   cin >> h >> w;
   Triangle object = Triangle(h, w);
   a = object.area();
   cout << "Triangle area is : " << a << endl;
   return 0;
}