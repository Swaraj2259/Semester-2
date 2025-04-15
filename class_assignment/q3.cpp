#include <iostream>
using namespace std;

int main() {
    int arr[] = {12, 5, 8, 19, 1};
    int n = 5;

    int smallest = arr[0];
    int largest = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i];
        }
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    cout << "Smallest: " << smallest << endl;
    cout << "Largest: " << largest << endl;

    return 0;
}