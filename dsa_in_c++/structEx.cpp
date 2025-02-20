#include<iostream>
using namespace std;

struct student{
    int roll;
    char name[30];
    float marks;
};
int main (){
    student s1;
    cout<<"Enter roll number: ";
    cin>>s1.roll;
    cout<<"Enter name: ";
    cin.getline(s1.name,30);
    cout<<"entre marks";
    cin>>s1.marks;
    cout<<"Roll: "<<s1.roll<<endl;
    cout<<"Name: "<<s1.name<<endl;
    cout<<"Marks: "<<s1.marks<<endl;
    return 0;

}

