// Q3: Implement queue operations.

#include <iostream>
using namespace std;
#define SIZE 5

class Queue {
    int items[SIZE], front, rear;
public:
    Queue() { front = -1; rear = -1; }

    void enqueue(int value) {
        if (rear == SIZE - 1) cout << "Queue Overflow\n";
        else {
            if (front == -1) front = 0;
            items[++rear] = value;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) cout << "Queue Underflow\n";
        else front++;
    }

    void display() {
        if (front == -1 || front > rear) cout << "Queue is Empty\n";
        else {
            for (int i = front; i <= rear; i++)
                cout << items[i] << " ";
            cout << endl;
        }
    }
};

int main() {
    Queue q;
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display();
    q.dequeue();
    q.display();
    return 0;
}