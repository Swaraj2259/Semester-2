#include <iostream>
using namespace std;

class Stack {
private:
    static const int MAX = 1000; 
    int arr[MAX];
    int top;

public:
    Stack() { top = -1; } 
    
    bool push(int x) {
        if (top >= MAX - 1) {
            cout << "Stack Overflow" << endl;
            return false;
        }
        arr[++top] = x;
        return true;
    }
    
    int pop() {
        if (top < 0) {
            cout << "Stack Underflow" << endl;
            return -1;
        }
        return arr[top--];
    }
    
    int peek() {
        if (top < 0) {
            cout << "Stack is Empty" << endl;
            return -1;
        }
        return arr[top];
    }
    
    bool isEmpty() {
        return (top < 0);
    }
};

int main() {
    Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout << "Top element: " << s.peek() << endl;
    cout << "Popped element: " << s.pop() << endl;
    cout << "Popped element: " << s.pop() << endl;
    cout << "Stack empty: " << (s.isEmpty() ? "Yes" : "No") << endl;
    return 0;
}
