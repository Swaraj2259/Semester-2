#include <iostream>
using namespace std;

int main(){


int arr[]={1,2,3,4,5};

cout<<arr<<endl;//address of first element
cout<<&arr[1]<<endl;//address of second element
cout<<*arr<<endl;//value of first element
cout<<*(arr+1)<<endl;//value of second element
cout<<*(arr+2)<<endl;//value of third element
cout<<*(arr+3)<<endl;
cout<<*(arr+4)<<endl;
cout<<*(arr+5)<<endl; 
cout<<*(arr+6)<<endl;
cout<<*(arr+7)<<endl;

}