#include <iostream>
#include <cmath>  
#include <stack>

using namespace std;

int postfixEvaluation(string S) {
    stack<int> s;  // Stack to store operands

    for (int i = 0; i < S.length(); i++) {
        if (S[i] >= '0' && S[i] <= '9') {  // If character is a digit
            s.push(S[i] - '0'); // Convert char to int and push
        } 
        else {  
            // Pop two operands from stack
            int operand2 = s.top();  
            s.pop();
            int operand1 = s.top();
            s.pop();

            // Perform operation based on the operator
            switch (S[i]) {
                case '+': 
                    s.push(operand1 + operand2); 
                    break;
                case '-': 
                    s.push(operand1 - operand2); 
                    break;
                case '*': 
                    s.push(operand1 * operand2); 
                    break;
                case '/': 
                    s.push(operand1 / operand2); 
                    break;
                case '^': 
                    s.push(pow(operand1, operand2)); 
                    break;
            }
        }
    }
    
    return s.top(); // Final result at the top of the stack
}

int main() {
    string expression = "231*+9-";  // Example postfix expression
    cout << "Result: " << postfixEvaluation(expression) << endl; 
    return 0;
}