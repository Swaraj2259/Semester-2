// Q4. BST Formation & In-Order Traversal:
// Insert 55, 30, 70, 20, 40, 60, 80, 35, 45 into an empty BST.
// What will be the in-order traversal of the BST?


#include <iostream>
using namespace std;

// Node structure
struct Node {
    int data;
    Node* left;
    Node* right;
    
    Node(int val) {
        data = val;
        left = right = NULL;
    }
};

// Function to insert a node in BST
Node* insert(Node* root, int val) {
    if (root == NULL) return new Node(val);
    
    if (val < root->data)
        root->left = insert(root->left, val);
    else
        root->right = insert(root->right, val);
    
    return root;
}

// In-order traversal function
void inorder(Node* root) {
    if (root == NULL) return;
    
    inorder(root->left);
    cout << root->data << " ";
    inorder(root->right);
}

// Main function
int main() {
    Node* root = NULL;
    
    // Insert values into BST
    int values[] = {55, 30, 70, 20, 40, 60, 80, 35, 45};
    for (int val : values)
        root = insert(root, val);
    
    // Perform in-order traversal
    cout << "In-order Traversal: ";
    inorder(root);
    
    return 0;
}