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
void insertAtEnd(Node* &head, int value) {
Node* newNode = new Node();
newNode->data = value;
newNode->next = nullptr; // New node points to NULL
if (head == nullptr) { // If list is empty
    head = newNode;
    return;
    
    }
    Node* temp = head;
    while (temp->next != nullptr) { // Traverse to the last node
    temp = temp->next;
    }
    temp->next = newNode; // Insert new node at the end
    }


void insertAfter(Node* head, int targetValue, int newValue) {
Node* temp = head;
    // Search for the target node
    while (temp != nullptr && temp->data != targetValue) {
    temp = temp->next;
    }
    if (temp == nullptr) {
    cout << "Node with value " << targetValue << " not found!" << endl;
    return;
    }
    // Create a new node
    Node* newNode = new Node();
    newNode->data = newValue;
    newNode->next = temp->next; // Link new node to next node
    temp->next = newNode; // Link target node to new node
    }
 void display(Node* head) {
    Node* temp = head;
    while (temp != nullptr) {
    cout << temp->data << " -> ";
    temp = temp->next;
}
cout << "NULL" << endl;
}

void deleteNode(Node* &head, int value) {
    if (head == nullptr) {
    cout << "List is empty!" << endl;
    return;
    }
    if (head->data == value) {
    Node* temp = head;
    head = head->next;
    delete temp;
    return;
    }
    Node * temp =head;
    Node * prev = nullptr;
    while (temp!=nullptr && temp -> data != value ){

        prev = temp;
        temp = temp->next;


    }
    if (temp == nullptr ){
        cout<<"the node was not found"<<endl;
    }
    prev->next = temp->next;
    delete temp;
}


int main() {
Node* head = nullptr;
insertAtBeginning(head, 10);
insertAtBeginning(head, 20);
insertAtEnd(head, 30);
insertAtEnd(head, 40);
cout << "Original Linked List: ";
display(head);
cout << "Inserting 25 after 20" << endl;
insertAfter(head, 20, 25);
cout << "Updated Linked List: ";
display(head);

cout << "Deleting node with value 20" << endl;
deleteNode(head, 20);

cout << "Updated Linked List: ";
display(head);
return 0;
}