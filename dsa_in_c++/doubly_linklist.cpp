#include <iostream>
using namespace std;
struct Node
{
    int data;
    Node *prev; // Pointer to previous node
    Node *next; // Pointer to next node
};
void insertAtBeginning(Node *&head, int value)
{
    Node *newNode = new Node();
    newNode->data = value;
    newNode->prev = nullptr;
    newNode->next = head;
    if (head != nullptr)
    {
        head->prev = newNode;
    }
    head = newNode;
}
void displayForward(Node *head)
{
    Node *temp = head;
    cout << "Forward: ";
    while (temp != nullptr)
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}
void displayBackward(Node *head)
{
    if (head == nullptr)
        return;
    Node *temp = head;
    while (temp->next != nullptr)
    { // Move to last node
        temp = temp->next;
    }

    cout << "Backward: ";
    while (temp != nullptr)
    {
        cout << temp->data << " -> ";
        temp = temp->prev;
    }
    cout << "NULL" << endl;
}

void insertAtEnd(Node *&head, int value)
{
    Node *newNode = new Node();
    newNode->data = value;
    newNode->next = nullptr;
    if (head == nullptr)
    {
        newNode->prev = nullptr;
        head = newNode;
        return;
    }
    Node *temp = head;
    while (temp->next != nullptr)
    {
        temp = temp->next;
    }
    temp->next = newNode;
    newNode->prev = temp;
}
void insertafter(Node *head, int targetValue, int newValue)
{
    Node *temp = head;
    while (temp->data != targetValue && temp->next != nullptr)
    {
        temp = temp->next;
    }
    if (temp==nullptr){
        cout << "Node with value " << targetValue << " not found!" << endl;
        return;
    }
    Node *newNode = new Node();
    newNode->data = newValue;
    newNode->next = temp->next;
    newNode->prev = temp;
    if (temp->next != nullptr)
    {
        temp->next->prev = newNode;
    }
    temp->next = newNode;
}

int main()
{
    Node *head = nullptr; // Initialize empty list
    insertAtBeginning(head, 10);
    insertAtBeginning(head, 20);
    cout << "Doubly Linked List (Forward): ";
    displayForward(head);
    cout << "Doubly Linked List (Backward): ";
    displayBackward(head);
    insertAtEnd(head, 30);
    insertAtEnd(head, 40);
    cout << "Doubly Linked List (Forward): ";
    displayForward(head);
    insertafter(head, 30, 35);
    cout << "Doubly Linked List (Forward): ";
    displayForward(head);
    return 0;
}