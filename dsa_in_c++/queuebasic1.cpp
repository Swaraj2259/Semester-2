#include <iostream>
#define SIZE 5  // Fixed size of queue

using namespace std;

class Queue {
public:
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