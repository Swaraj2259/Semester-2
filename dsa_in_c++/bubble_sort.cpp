#include<iostream>
using namespace std;

void bubble(int arr[],int n){
    int i,j;
    for (int i=0;i<n-1;i++){
        for (j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1])
            swap(arr[j],arr[j+1]);

        }

    }
}
void printarr(int arr[],int n){
    for (int i=0;i<n-1;i++){
        cout<<arr[i]<<" ";
    }
}

int main(){
    int n =10;
    int arr[]={1,3,2,5,4,6,9,8,7};
    

    bubble(arr,n);
    printarr(arr,n);
}