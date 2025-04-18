// Q6: Search an element in a linked list? Write the implementation.
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