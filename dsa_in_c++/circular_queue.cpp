//Circular queue C++ program
#include<iostream>
#define MAX_SIZE 4 // Maximum size of the queue
using namespace std;
class CircularQueue
{
private:
int front, rear;
int arr[MAX_SIZE];
public:
CircularQueue ()
{
front = -1;
rear = -1;
}
// Function to check if the queue is full
bool isFull ()
{
if ((front == 0 && rear == MAX_SIZE - 1)
|| (rear == (front - 1) % (MAX_SIZE - 1)))
{
return true;
}
return false;

}
// Function to check if the queue is empty
bool isEmpty ()
{
if (front == -1)
{
return true;
}
return false;
}
// Function to add an element to the queue
void enQueue (int value)
{
if (isFull ())
{
cout << "Queue is full." << endl;
}
else
{
if (front == -1)
{
front = 0;
}
rear = (rear + 1) % MAX_SIZE;
arr[rear] = value;
cout << "Enqueued element: " << value << endl;
}
}
// Function to remove an element from the queue
int deQueue ()
{
int element;
if (isEmpty ())
{

cout << "Queue is empty." << endl;
return -1;
}
else
{
element = arr[front];
if (front == rear)
{
front = -1;
rear = -1;
}
else
{
front = (front + 1) % MAX_SIZE;
}
cout << "Dequeued element: " << element << endl;
return element;
}
}
// Function to display the elements in the queue
void display ()
{
if (isEmpty ())
{
cout << "Queue is empty." << endl;
}
else
{
cout << "Elements in the queue: ";
int i;
for (i = front; i != rear; i = (i + 1) % MAX_SIZE)
{
cout << arr[i] << " ";
}

cout << arr[i] << endl;
}
}
};
int main ()
{
CircularQueue q;
q.enQueue (10);
q.enQueue (20);
q.enQueue (30);
q.enQueue (40);
q.display ();
q.deQueue ();
q.deQueue ();
q.display ();
q.enQueue (50);
q.enQueue (60);
q.display ();
return 0;
}