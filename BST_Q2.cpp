// Q2. Node Positioning:
// Insert 40, 20, 60, 10, 30, 50, 70 into a BST.
// Which node will be the right child of 20?

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

// Function to find right child of a given node
Node* findRightChild(Node* root, int val) {
    if (root == NULL) return NULL;
    
    if (root->data == val)
        return root->right; // Return right child
    
    if (val < root->data)
        return findRightChild(root->left, val);
    else
        return findRightChild(root->right, val);
}

// Main function
int main() {
    Node* root = NULL;
    
    // Insert values into BST
    int values[] = {40, 20, 60, 10, 30, 50, 70};
    for (int val : values)
        root = insert(root, val);
    
    // Find right child of 20
    Node* rightChild = findRightChild(root, 20);
    
    if (rightChild)
        cout << "Right child of 20: " << rightChild->data << endl;
    else
        cout << "No right child found for 20" << endl;
    
    return 0;
}