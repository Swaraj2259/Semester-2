// Q3. Deleting a Leaf Node:
// Given the BST below, what will be the in-order traversal after
// deleting node 5?

// 10
// / \
// 5 15
// /
// 2
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

// Function to find the minimum value node in a subtree
Node* minValueNode(Node* node) {
    while (node->left) node = node->left;
    return node;
}

// Function to delete a node from BST
Node* deleteNode(Node* root, int key) {
    if (root == NULL) return root;
    
    if (key < root->data)
        root->left = deleteNode(root->left, key);
    else if (key > root->data)
        root->right = deleteNode(root->right, key);
    else {
        // Case 1: Node has no children (leaf node)
        if (root->left == NULL && root->right == NULL) {
            delete root;
            return NULL;
        }
        // Case 2: Node has one child
        else if (root->left == NULL) {
            Node* temp = root->right;
            delete root;
            return temp;
        }
        else if (root->right == NULL) {
            Node* temp = root->left;
            delete root;
            return temp;
        }
    }
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
    int values[] = {10, 5, 15, 2};
    for (int val : values)
        root = insert(root, val);
    
    // Perform deletion of node 5
    root = deleteNode(root, 5);
    
    // Perform in-order traversal
    cout << "In-order Traversal after deletion: ";
    inorder(root);
    
    return 0;
}