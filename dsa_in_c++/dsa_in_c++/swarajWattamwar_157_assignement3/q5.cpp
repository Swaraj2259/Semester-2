// wap to find the greatest among three integers using pointers,new and delete operators.

#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;
    int *p1 = new int;
    int *p2 = new int;
    int *p3 = new int;
    *p1 = a;
    *p2 = b;
    *p3 = c;
    if (*p1 > *p2 && *p1 > *p3) {
        cout << "Greatest number: " << *p1 << endl;
    } else if (*p2 > *p1 && *p2 > *p3) {
        cout << "Greatest number: " << *p2 << endl;
    } else {
        cout << "Greatest number: " << *p3 << endl;
    }
    delete p1;
    delete p2;
    delete p3;
    return 0;
}