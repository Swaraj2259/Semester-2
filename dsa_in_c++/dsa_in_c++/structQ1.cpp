#include <iostream>
using namespace std;

struct person
{
    string name ;
    int age;
    float heigt;

};

int main (){
    person s1;
    cout<<"name- "<<endl;
    cin>>s1.name;
    cout<<"age - "<<endl;
    cin>>s1.age;
    cout<<"heigt"<<endl;
    cin>>s1.heigt;

    cout <<s1.name<<endl;
    cout <<s1.age<<endl;
    cout <<s1.heigt<<endl;

}

    

