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



 void traverse(Node* head) {
    Node* temp = head;
    while (temp != nullptr) {
    cout << temp->data << " -> ";
    temp = temp->next;
}
cout << "NULL" << endl;
}





int main() {
Node* head = nullptr;
insertAtBeginning(head, 10);
insertAtBeginning(head, 20);
insertAtBeginning(head, 30);    
insertAtBeginning(head, 40);
insertAtBeginning(head, 50);

traverse(head);



return 0;
}
