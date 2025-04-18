#include<iostream>
using namespace std;

int main(){
    int arr[5] = {1, 2, 3, 4, 5};
   cout<<arr
    return 0;
};

// wap take 10 numbers from user and make array and print it and one loop 
// int main(){
//     int abb[10];
//     cout << "Enter 10 numbers: ";
//     for (int i = 0; i < 10; i++) {
//         cin >> abb[i];
//     }
    
//     cout << "The numbers you entered are: ";
//     for (int i = 0; i < 10; i++) {
//         cout << abb[i] << " ";
//     }
    
//     return 0;
// }

// #include <iostream> // Use the correct header file
// using namespace std;

// int main() {
//     int i;
//     int A[10], B[10] = {0}, C[10] = {0}; // Initialize B and C to avoid garbage values

//     cout << "Enter 10 integers: "; // Use proper quotes
//     for (i = 0; i < 10; i++) {
//         cin >> A[i];
//         if (A[i] % 2 == 0) {
//             B[i] = A[i]; // Store even numbers in B
//         } else {
//             C[i] = A[i]; // Store odd numbers in C
//         }
//     }

//     cout << "B elements (Even numbers): ";
//     for (i = 0; i < 10; i++) {
//         if (B[i] != 0) // Avoid printing default zeros
//             cout << B[i] << "  ";
//     }
//     cout << endl;

//     cout << "C elements (Odd numbers): ";
//     for (i = 0; i < 10; i++) {
//         if (C[i] != 0) // Avoid printing default zeros
//             cout << C[i] << " ";
//     }
//     cout << endl;
// }
// #include <iostream>
// using namespace std;

// int main() {
//     int loc = -1, num;
//     int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//     cout << "Enter the number you want to search: ";
//     cin >> num;

//     for (int i = 0; i < 10; i++) { 
//         if (arr[i] == num) {
//             loc = i; // Store the location (index)
//             break;   // Exit the loop once the number is found
//         }
//     }

//     if (loc != -1) {
//         cout << "Number found at position: " << loc << endl; // Display 1-based position
//     } else {
//         cout << "Number not found in the array." << endl;
//     }

//     return 0;
// }


// #include<iostream>
// using namespace std;

// int main(){
//     int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//     int siz = 10;
//     cout<<sizeof(arr)/sizeof(int)<<endl;
//     return 0;
// };


// #include<iostream>
// using namespace std;

// int main(){
//     int size=6;
//     int mark[size];

//     for(int i=0;i<size;i++){
//         cin>>mark[i];
//     }
//     for(int i=0;i<size;i++){
//         cout<<mark[i]<<endl;
//     }

//     return 0;
// };


// '''Write a C++ program to find the smallest and largest numbers in a predefined array 
// and print their respective indixes. Use INT_MAX and INT_MIN .'''

#include <iostream>
// #include <climits> // For INT_MAX and INT_MIN
using namespace std;

int main() {
    // Predefined array
    int arr[] = {12, 5, 8, 20, 3};
    int n = sizeof(arr) / sizeof(arr[0]); // Calculate the size of the array

    int smallest = INT_MAX; // Initialize to the maximum possible integer
    int largest = INT_MIN;  // Initialize to the minimum possible integer
    int smallestIndex = -1, largestIndex = -1;

    // Find smallest and largest numbers and their indices
    for (int i = 0; i < n; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i];
            smallestIndex = i;
        }
        if (arr[i] > largest) {
            largest = arr[i];
            largestIndex = i;
        }
    }

    // Output the results
    cout << "Smallest number: " << smallest << ", Index: " << smallestIndex << endl;
    cout << "Largest number: " << largest << ", Index: " << largestIndex << endl;

    return 0;
}