#include <iostream>
using namespace std;

int main () {
    // Variables & Data types
    string name = "Thervs"; 
    int age = 20;
    double weight = 69.5;
    bool handsome = true;

    cout << "Name: " + name + "\n";
    cout << "Age: " + age << endl;
    cout << "Weight: " << weight << endl;
    cout << "Handsome: " + handsome << endl;
    
    //arithmetic + - * / %  ++ --
    int x = 60, y = 7, z = x + y;
    cout << "\n\tSum of x + y = " + z << endl;

    //Assignment operators += -= *= /= %= same as x + (x[other assignmet ops]) = num
    //logial operators = && || !

    //all about if...else statement & switch
    int expression = 0;
    if (expression == 20) {
        //declare the output for this condition
    } else if (expression != 20) {
        //declare the output for this condition
    } else {
        //if all the condition has not been met declare this output
    }

    switch(expression) {
        case 1: //declare something if the expression is equal to 1.
            break;
        case 2: //declare something if the expression is equal to 2.
            break;
        default: //declare something if all the cases has not been met.
            break;
    } 

    //all about loops
    for (int i = 0; i < 5; i++) {
        //loop the content
    }

    while (expression != 0) {
        //loop the content 
    }
    do {
        //loop the content first before the condition
    } while (expression != 0);
        // you can use either break; continue; depending on what you might need.

    //All about array
    int size = 3;
    string swimIMStrokes[] = {"Fly","Back","Breast","Free",};
    cout << swimIMStrokes << endl;
    int* arr = new int[size];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
  
    //method call

}
//all about methods
void myMethod(string param1, string param2) {
   cout << "Content of Parameter 1: " + param1 <<endl;
   cout << "Content of Parameter 2: " + param2 <<endl;
}
void myMethod(string param1, string param2, int param3) {} //method overloading


