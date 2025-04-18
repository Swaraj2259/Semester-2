#include <iostream>
using namespace std;
struct Node {
int data; // Data part
Node* next; // Pointer to the next node
};
void insertAtBeginning(Node* &head, int value) {
Node* newNode = new Node();//dma
newNode->data = value;
newNode->next = head; // Point new node to the current head
head = newNode; // Update head to new node
}



 void display(Node* head) {
    Node* temp = head;
    while (temp != nullptr) {
    cout << temp->data << " -> ";
    temp = temp->next;
}
cout << "NULL" << endl;
}



int getLength(Node* head) {
    int count = 0;
    Node* temp = head;
    
    while (temp != nullptr) {  // Traverse through the list
        count++;
        temp = temp->next;
    }
    
    return count;  // Return the total count
}

int main() {
Node* head = nullptr;
insertAtBeginning(head, 10);
insertAtBeginning(head, 20);
insertAtBeginning(head, 30);    
insertAtBeginning(head, 40);
insertAtBeginning(head, 50);
getLength(head);
cout << "Length of the linked list: " << getLength(head) << endl;
display(head);




return 0;
}
