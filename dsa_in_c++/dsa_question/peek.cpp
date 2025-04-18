#include <iostream>
using namespace std;

#define MAX 5  
class Stack {
private:
    int arr[MAX]; 
    int top;      
public:
    Stack() { top = -1; } 
    
    void push(int value) {
        if (top == MAX - 1) {
            cout << "Stack Overflow! Cannot push " << value << endl;
            return;
        }
        arr[++top] = value;
        cout << value << " pushed into stack." << endl;
    }

   
    void pop() {
        if (top == -1) {
            cout << "Stack Underflow! No elements to pop." << endl;
            return;
        }
        cout << "Popped element: " << arr[top--] << endl;
    }

    
    int peek() {
        if (top == -1) {
            cout << "Stack is empty!" << endl;
            return -1;
        }
        return arr[top];
    }

    
    void display() {
        if (top == -1) {
            cout << "Stack is empty!" << endl;
            return;
        }
        cout << "Stack elements: ";
        for (int i = top; i >= 0; i--) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    Stack stack;

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.display();

    cout << "Top element (Peek): " << stack.peek() << endl;

    stack.pop();
    stack.display();

    return 0;
}
