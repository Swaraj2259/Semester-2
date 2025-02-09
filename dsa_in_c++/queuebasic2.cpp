#include <iostream>
using namespace std;

class Queue {
private:
    int* arr;
    int front, rear, capacity;

public:
    // Constructor to initialize the queue
    Queue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Method to check if the queue is empty
    bool isEmpty() {
        return front > rear;
    }

    // Method to insert an element into the queue (enqueue)
    void enqueue(int data) {
        if (rear == capacity - 1) {
            cout << "Overflow Error" << endl;
            return;
        }
        rear++;
        arr[rear] = data;
        cout << data << " inserted into the queue." << endl;
    }

    // Method to remove an element from the queue (dequeue)
    void dequeue() {
        if (isEmpty()) {
            cout << "Underflow Error" << endl;
            return;
        }
        cout << arr[front] << " removed from the queue." << endl;
        front++;
    }

    // Destructor to free dynamically allocated memory
    ~Queue() {
        delete[] arr;
    }
};

int main() {
    Queue q(5); // Creating a queue of size 5

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.dequeue(); // Removes 10
    q.dequeue(); // Removes 20
    q.dequeue(); // Removes 30
    q.dequeue(); // This will give an underflow error

    return 0;
}