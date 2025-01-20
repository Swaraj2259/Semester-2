// example of bubble sort
//  #include <iostream>
//  using namespace std;

// // Function to perform Bubble Sort
// void bubbleSort(int arr[], int n) {
//     for (int i = 0; i < n - 1; i++) { // Number of passes
//         for (int j = 0; j < n - i - 1; j++) { // Compare adjacent elements
//             if (arr[j] > arr[j + 1]) {
//                 // Swap if the left element is greater than the right element
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
// }

// // Function to print the array
// void printArray(int arr[], int n) {
//     for (int i = 0; i < n; i++) {
//         cout << arr[i] << " ";
//     }
//     cout << endl;
// }

// // Main function
// int main() {
//     // Example array
//     int arr[] = {5, 2, 9, 1, 5, 6};
//     int n = sizeof(arr) / sizeof(arr[0]); // Calculate the size of the array

//     cout << "Original array: ";
//     printArray(arr, n);

//     // Call Bubble Sort
//     bubbleSort(arr, n);

//     cout << "Sorted array: ";
//     printArray(arr, n);

//     return 0;
// }

// #include<iostream>
// using namespace std;

// int main(){
//     int arr[10] = {12, 23, 1, 2, 3, 56, 78, 99, 7, 16};
//     int n = 10;

//     // Bubble sort
//     for(int i = 0; i < n - 1; i++) {
//         for(int j = 0; j < n - i - 1; j++) {
//             if(arr[j] > arr[j + 1]) {
//                 swap(arr[j], arr[j + 1]);
//             }
//         }
//     }

//     // Print sorted array
//     for(int i = 0; i < n; i++) {
//         cout << arr[i] << " ";  // Print each element in the array
//     }
//     cout << endl;  // Move to the next line after printing the array

//     return 0;
// }

#include <iostream>
using namespace std;
void BUBBLE_SORT(int A[], int N)
{
    int i, j, t;
    for (i = 0; i < N - 1; i++)
    {
        for (j = 0; j < N - i - 1; j++)
        {
            if (A[j] > A[j + 1])
            {
                t = A[j];
                A[j] = A[j + 1];
                A[j + 1] = t;
            }
        }
    }
}
int main()
{
    int A[10] = {5, 2, 9, 1, 5, 6}; // array to be sorted
    int i=6;
    BUBBLE_SORT(A, i);
{
    cout << "The array before sorting is: ";
    for (int v = 0; v < 6; v++)
    {
        cout << A[v] << " ";
    }
    cout << "\nThe array after sorting is: ";

    for (int x=1; x<6;x++)
    {
        cout << A[x] << " ";
    }
    cout << endl;
}
    return 0;
}
