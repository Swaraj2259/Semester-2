#include <iostream>

using namespace std;
struct Node
{
    int data;
    Node *next;
};

void insertAtBeginning(Node *&head, int value)
{
    Node *newNode = new Node();
    newNode->data = value;
    if (head == nullptr)
    { // Empty list
        newNode->next = newNode;
        head = newNode;
    }
    else
    {
        Node *temp = head;
        while (temp->next != head)
        { // Find last node
            temp = temp->next;
        }
        newNode->next = head;
        temp->next = newNode;
        head = newNode;
    }
}
void insertAtEnd(Node *&head, int value)
{
    Node *newNode = new Node();
    newNode->data = value;
    if (head == nullptr)
    { // Empty list
        newNode->next = newNode;
        head = newNode;
    }
    else
    {
        Node *temp = head;
        while (temp->next != head)
        { // Find last node
            temp = temp->next;
        }
        newNode->next = head;
        temp->next = newNode;
    }
}

void insertAfter(Node *head, int targetValue, int newValue)
{
    Node *temp = head;
    while (temp->data != targetValue && temp->next != head)
    {
        temp = temp->next;
    }
    if (temp->data == targetValue)
    {
        Node *newNode = new Node();
        newNode->data = newValue;
        newNode->next = temp->next;
        temp->next = newNode;
    }
    else
    {
        cout << "Node with value " << targetValue << " not found!" << endl;
    }
}

void deleteNode(Node *&head, int value)
{
    if (head == nullptr)
        return; // Empty list
    Node *temp = head;
    Node *prev = nullptr;
    // Case 1: Deleting head node
    if (head->data == value)
    {
        Node *last = head;
        while (last->next != head)
        { // Find last node
            last = last->next;
        }
        if (head == head->next)
        { // Only one node in list
            delete head;
            head = nullptr;
        }
        else
        {
            last->next = head->next;
            delete head;
            head = last->next;
        }
        return;
    }

    // Case 2: Deleting non-head node
    do
    {
        prev = temp;
        temp = temp->next;
    } while (temp != head && temp->data != value);
    if (temp->data == value)
    {
        prev->next = temp->next;
        delete temp;
    }
    else
    {
        cout << "Node with value " << value << " not found!" << endl;
    }
}
void display(Node *head)
{
    if (head == nullptr)
    {
        cout << "List is empty!" << endl;
        return;
    }
    Node *temp = head;
    do
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    } while (temp != head);
    cout << "(Head)" << endl;
}

int main()
{
    Node *head = nullptr; // Initialize empty list
    insertAtBeginning(head, 10);
    insertAtBeginning(head, 20);
    insertAtEnd(head, 30);
    insertAtEnd(head, 40);
    cout << "Circular Linked List: ";
    display(head);
    cout << "Inserting 25 after 20" << endl;
    insertAfter(head, 20, 25);

    display(head);
    cout << "Deleting node with value 20" << endl;
    deleteNode(head, 20);
    display(head);
    return 0;
}