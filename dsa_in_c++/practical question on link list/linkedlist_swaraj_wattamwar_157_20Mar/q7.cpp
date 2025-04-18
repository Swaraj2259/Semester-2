// Q7: Write the function to insert a new node at the end position in a linked list.

void insertEnd(Node** head, int newData) {
    Node* newNode = new Node();
    newNode->data = newData;
    newNode->next = NULL;

    if (*head == NULL) {
        *head = newNode;
        return;
    }

    Node* temp = *head;
    while (temp->next != NULL) 
    temp = temp->next;
    temp->next = newNode;
}