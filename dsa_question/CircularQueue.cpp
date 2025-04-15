#include <iostream>
using namespace std;

#define MAX 5  

class CircularQueue {
private:
    int arr[MAX]; 
    int front, rear; 

public:
    CircularQueue() {
        front = -1;
        rear = -1;
    }

    
    void enqueue(int value) {
        if ((rear + 1) % MAX == front) {
            cout << "Queue Overflow! Cannot insert " << value << endl;
            return;
        }
        if (front == -1) 
            front = 0;
        rear = (rear + 1) % MAX; 
        arr[rear] = value;
        cout << value << " enqueued into queue." << endl;
    }

    
    void display() {
        if (front == -1) {
            cout << "Queue is empty!" << endl;
            return;
        }
        cout << "Queue elements: ";
        int i = front;
        while (true) {
            cout << arr[i] << " ";
            if (i == rear)
                break;
            i = (i + 1) % MAX; 
        }
        cout << endl;
    }
};

int main() {
    CircularQueue queue;

    
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50); 

    queue.display(); 
    return 0;
}
