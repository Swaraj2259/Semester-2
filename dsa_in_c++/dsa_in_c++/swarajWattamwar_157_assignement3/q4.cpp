// wap to find the greatest of two integers using pointers,new,delete operator.

#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Enter two numbers: ";
    cin >> a >> b;
    int *p1 = new int;
    int *p2 = new int;
    *p1 = a;
    *p2 = b;
    if (*p1 > *p2) {
        cout << "Greatest number: " << *p1 << endl;
    } else {
        cout << "Greatest number: " << *p2 << endl;
    }
    delete p1;
    delete p2;
    return 0;
}