// Write a program to implement Selection Sort and sort an array.

#include <iostream>
using namespace std;

void selectionSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) { 
        int smallestIdx = i; // Start of the unsorted part
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[smallestIdx]) {
                smallestIdx = j;
            }
        }
        swap(arr[i], arr[smallestIdx]);
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int arr[] = {9, 6, 3, 1, 7};
    int n =5;

    cout << "Original array: ";
    printArray(arr, n);

    selectionSort(arr, n);

    cout << "Sorted array: ";
    printArray(arr, n);

    return 0;
}