#include <iostream>
using namespace std;

// Function for binary search
int binarySearch(int arr[], int size, int target) {
    int left = 0;         // Starting index
    int right = size - 1; // Ending index

    while (left <= right) {
        int mid = left + (right - left) / 2; // Calculate the middle index

        // Check if the target is at the mid
        if (arr[mid] == target) {
            return mid; // Target found
        }
        // If the target is smaller, ignore the right half
        else if (arr[mid] > target) {
            right = mid - 1;
        }
        // If the target is larger, ignore the left half
        else {
            left = mid + 1;
        }
    }
    return -1; // Target not found
}

int main() {
    int arr[] = {2, 4, 6, 8, 10, 12, 14};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target;

    cout << "Enter the number to search: ";
    cin >> target;

    int result = binarySearch(arr, size, target);

    if (result != -1) {
        cout << "Element found at index " << result << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}