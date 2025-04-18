#include<iostream>
using namespace std;

int main() {
    int num = 10;
    int *ptr = &num;
    int **pptr = &ptr;

    cout << "Value of num: " << num << endl;
    cout << "Address of num: " << &num << endl;
    cout << "Value of ptr: " << ptr << endl;
    cout << "Address of ptr: " << &ptr << endl;
    cout << "Value at the address stored in ptr: " << *ptr << endl;
    cout << "Value of pptr: " << pptr << endl;
    cout << "Address of pptr: " << &pptr << endl;
    cout << "Value at the address stored in pptr: " << *pptr << endl;
    cout << "Value at the address stored in the address stored in pptr: " << **pptr << endl;

    return 0;
}