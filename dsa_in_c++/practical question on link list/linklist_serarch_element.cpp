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
void searching(Node* head, int targetValue) {
    Node* temp = head;

    // Search for the target node
    while (temp != nullptr && temp->data != targetValue) {
        temp = temp->next;
    }

    // Check if node was found
    if (temp == nullptr) {
        cout << "Node with value " << targetValue << " not found!" << endl;
    } else {
        cout << "Node with value " << targetValue << " found!" << endl;
    }
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

    searching(head, 20);
    searching(head, 50);
    return 0;
}
