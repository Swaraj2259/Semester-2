#include<iostream>
using namespace std;
//wap to swap two numbers using pointers without using third variable using new and delete
int main()
{
    int *a=new int;
    int *b=new int;
    cout<<"Enter the value of a and b"<<endl;
    cin>>*a>>*b;
    cout<<"Before swapping a="<<*a<<" b="<<*b<<endl;
    *a=*a+*b;
    *b=*a-*b;
    *a=*a-*b;
    cout<<"After swapping a="<<*a<<" b="<<*b<<endl;
    delete a;
    delete b;
}
