#include<iostream>
using namespace std;
int main()
{
    int * a=new int;
    int *b=new int;
    cout<<"Enter the value of a and b"<<endl;
    cin>>*a>>*b;
    cout<<"Sum of a and b is "<<*a+*b<<endl;
    delete a;
    delete b;
}