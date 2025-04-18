// Q4: What is a circular queue? Implement all operations.
// Definition:

// A circular queue is a linear data structure where the last position is connected to the first,
//  forming a circle.

#include <iostream>
using namespace std;

class Queue {
private:
    int* arr;
    int front, rear, capacity;

public:
   
    Queue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }


    bool isEmpty() {
        return front > rear;
    }


    void enqueue(int data) {
        if (rear == capacity - 1) {
            cout << "Overflow Error" << endl;
            return;
        }
        rear++;
        arr[rear] = data;
        cout << data << " inserted into the queue." << endl;
    }

    
    void dequeue() {
        if (isEmpty()) {
            cout << "Underflow Error" << endl;
            return;
        }
        cout << arr[front] << " removed from the queue." << endl;
        front++;
    }


    
};

int main() {
    Queue q(5); 

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.dequeue();
    q.dequeue(); 
    q.dequeue(); 
    q.dequeue(); // This will give an underflow error

    return 0;
}