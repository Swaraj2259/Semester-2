// Q1: Write the function to insert a new node after a specific node in a circular linked list.

void insertAfter(Node* prevNode, int newData) {
    if (prevNode == NULL) return;

    Node* newNode = new Node();
    newNode->data = newData;
    newNode->next = prevNode->next;
    prevNode->next = newNode;
}
  
