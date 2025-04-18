#include <iostream>

using namespace std;

class Queue {
public:
    static const int SIZE = 5;  // Fixed size of queue
    int arr[SIZE];  
    int front, rear;  

    Queue() {  
        front = -1;
        rear = -1;
    }

    void enqueue(int value) {  
        if (rear == SIZE - 1) {  
            cout << "Queue Overflow! Cannot insert " << value << endl;
            return;
        }
        if (front == -1) front = 0;  
        rear++;  
        arr[rear] = value;  
        cout << "Inserted: " << value << endl;
    }
};

int main() {
    Queue q;  
    q.enqueue(10);  
    q.enqueue(20);  
    q.enqueue(30);
    return 0;
} 

// #include <iostream>
// using namespace std;

// class Queue {
// private:
//     int* arr;
//     int front, rear, capacity;

// public:
//     // Constructor to initialize the queue
//     Queue(int size) {
//         capacity = size;
//         arr = new int[capacity];
//         front = 0;
//         rear = -1;
//     }

//     // Method to check if the queue is full
//     bool isFull() {
//         return rear == capacity - 1;
//     }

//     // Method to insert an element into the queue
//     void enqueue(int data) {
//         if (isFull()) {
//             cout << "Overflow Error" << endl;
//             return;
//         }
//         rear++;
//         arr[rear] = data;
//         cout << data << " inserted into the queue." << endl;
//     }

//     // Destructor to free dynamically allocated memory
//     ~Queue() {
//         delete[] arr;
//     }
// };

// int main() {
//     Queue q(5); // Creating a queue of size 5

//     q.enqueue(10);
//     q.enqueue(20);
//     q.enqueue(30);
//     q.enqueue(40);
//     q.enqueue(50);
//     q.enqueue(60); // This will give overflow error

//     return 0;
// }