#include <iostream>
using namespace std;

// Define a class for Selection Sort
class SelectionSort {
private:
    int arr[100]; // Array to store elements
    int n;        // Number of elements in the array

public:
    // Function to take input from the user
    void inputArray() {
        cout << "Enter the number of elements: ";
        cin >> n;
        cout << "Enter " << n << " elements: ";
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
    }

    // Function to sort the array using Selection Sort
    void sortArray() {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // Show the array after each iteration
            cout << "After iteration " << i + 1 << ": ";
            displayArray();
        }
    }

    // Function to display the array
    void displayArray() {
        for (int i = 0; i < n; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

// Main function
int main() {
    SelectionSort sorter; // Create an object of the SelectionSort class

    // Input the array
    sorter.inputArray();

    // Display the original array
    cout << "Original Array: ";
    sorter.displayArray();

    // Sort the array
    cout << "\nSorting Steps:\n";
    sorter.sortArray();

    // Display the sorted array
    cout << "\nSorted Array: ";
    sorter.displayArray();

    return 0;
}